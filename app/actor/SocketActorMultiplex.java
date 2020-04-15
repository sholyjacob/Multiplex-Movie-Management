package actor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.stream.Materializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.MultiplexModel;

import java.util.concurrent.CompletionStage;

public class SocketActorMultiplex extends AbstractActor {

    private ActorRef guardian;

    public SocketActorMultiplex(ActorRef guardian){
        this.guardian = guardian;
    }

    // not going to return actorRef
    // special object : Props
    public static Props init(ActorRef guardian){
        // this will initiate the set of prop for current actor
        System.out.println("SocketActor");
        return Props.create(SocketActorMultiplex.class, ()-> new SocketActorMultiplex(guardian));
    }

    // message processing method
    private void processMessage(JsonNode jsonNode){
        // if required convert into request model
        // fetch random message from Rest API
        String message =jsonNode.toString();
        System.out.println("Processing message");
        CompletionStage<HttpResponse> responseFuture= this.callRestApi(message);
        // 1. consume and convert into my model format
        // 2. convert into JsonNode and send it to client
        responseFuture.thenCompose(this::consumeHttpResponse)
                .thenAccept(messageModel -> {
                    System.out.println("DATA : " + messageModel);
                    // convert to JsonNode : design util classes
                    ObjectMapper mapper = new ObjectMapper();
                    JsonNode json = mapper.convertValue(messageModel, JsonNode.class);
                    // sent to guardian actor
                    this.guardian.tell(json, getSelf());
                });


    }

    // method to generate a http call to an REST API
    private CompletionStage<HttpResponse> callRestApi(String name){
        // generate a random number
        System.out.println("Calling Rest API");
        return Http.get(getContext().getSystem()).singleRequest(HttpRequest.create("http://localhost:9000/multiplex/searchByName" + name));
    }

    // method to consume httpResponse
    private CompletionStage<MultiplexModel> consumeHttpResponse(HttpResponse httpResponse){
        // get mat from actorSystem
        System.out.println("Consuming");
        Materializer materializer = Materializer.matFromSystem(getContext().getSystem());
        System.out.println("response"+httpResponse.entity());
        return Jackson.unmarshaller(MultiplexModel.class)
                .unmarshal(httpResponse.entity(), materializer)
                .thenApply(multiplexModel -> {
                    this.discardEntity(httpResponse, materializer);
                    return multiplexModel;
                });
    }

    private void discardEntity(HttpResponse httpResponse, Materializer materializer) {
        httpResponse.discardEntityBytes(materializer)
                .completionStage()
                .whenComplete((done, ex) -> System.out.println("Discarded"));
    }


    @Override
    public Receive createReceive() {
        System.out.println("createReceive");
        return receiveBuilder()
                // we recieve message of type JsonNode

                .match(JsonNode.class, this::processMessage)
                .build();
    }
}
