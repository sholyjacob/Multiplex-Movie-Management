package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.MultiplexModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.MultiplexService;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class MultiplexController extends Controller {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Inject
    public MultiplexService multiplexService;
    @Inject
    FormFactory formFactory;
    @Inject
    private HttpExecutionContext httpExecutionContext;

    @Inject
    MessagesApi messagesApi;
    public Result save(Http.Request request){
        // fetch the virtual form
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).bindFromRequest(request);

        // validate the constraint status
        if(multiplexForm.hasErrors()){
            // reflect back same view page
            logger.error("errors = {}", multiplexForm.errors());
            // show a flash message
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.multiplexes.createMultiplex.render(multiplexForm, request, messagesApi.preferred(request)));
        }

        // fetch product object
        MultiplexModel multiplexModel =  multiplexForm.get();
        // add to repo
        // ProductRepository.getProducts().add(product);

        // send this service layer

        this.multiplexService.addMultiplex(multiplexModel);
        request.flash().adding("success", "Record Added Successfully");

        // redirect it to list page
        return redirect(routes.MultiplexController.listAll());
       /* JsonNode json = request.body().asJson();
        json.get
        MovieModel model =Json.fromJson(json,MovieModel.class);
        System.out.println(model.getName()+"*************************");
        //Optional<MovieModel> movie = request.body().parseJson(MovieModel.class);
        movieService.addMovie(model);
        return ok("movie added");*/
    }
    public Result listAll() {
        List<MultiplexModel> multiplexModels = this.multiplexService.listAll();
        return ok(views.html.multiplexes.indexMultiplex.render(multiplexModels));
    }
    public Result createcMultiplex(Http.Request request) {

        // createmovie a Virtual form from Product Model
        Form<MultiplexModel> multiplexModelForm = formFactory.form(MultiplexModel.class);
        // return response :  render-view
        return ok(views.html.multiplexes.createMultiplex.render(multiplexModelForm, request, messagesApi.preferred(request)));
    }
    public Result updateMultiplex(Http.Request request,Integer id) {

        // createmovie a Virtual form from Product Model
        MultiplexModel multiplex = this.multiplexService.findById(id);
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).fill(multiplex);
        // return response :  render-view
        return ok(views.html.multiplexes.updateMultiplex.render(multiplexForm,request, messagesApi.preferred(request)));
    }
    public Result deleteMultiplex(Http.Request request,Integer id){
        this.multiplexService.deleteMultiplex(id);
        request.flash().adding("success", "Record deleted Successfully");
        List<MultiplexModel> multiplexes = this.multiplexService.listAll();
        return ok(views.html.multiplexes.indexMultiplex.render(multiplexes));
    }
    public Result update(Http.Request request){
        // fetch the virtual form
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).bindFromRequest(request);

        // validate the constraint status
        if(multiplexForm.hasErrors()){
            // reflect back same view page
            logger.error("errors = {}", multiplexForm.errors());
            // show a flash message
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.multiplexes.updateMultiplex.render(multiplexForm, request, messagesApi.preferred(request)));
        }

        // fetch product object
        MultiplexModel multiplexModel =  multiplexForm.get();
        // add to repo
        // ProductRepository.getProducts().add(product);

        // send this service layer

        this.multiplexService.updateMultiplex(multiplexModel);
        request.flash().adding("success", "Record Added Successfully");

        // redirect it to list page
        return redirect(routes.MultiplexController.listAll());
       /* JsonNode json = request.body().asJson();
        json.get
        MovieModel model =Json.fromJson(json,MovieModel.class);
        System.out.println(model.getName()+"*************************");
        //Optional<MovieModel> movie = request.body().parseJson(MovieModel.class);
        movieService.addMovie(model);
        return ok("movie added");*/
    }
    public CompletionStage<Result> searchByName(String name){
        return supplyAsync(()->{
            // fetch records from DB
            MultiplexModel multiplex = this.multiplexService.searchByName(name);
            // Mapper object to convert Java List into JSON array
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseObject = mapper.convertValue(multiplex, JsonNode.class);
            ObjectNode result = Json.newObject();
            result.putPOJO("body", responseObject);
            return ok(result);
        }, httpExecutionContext.current());
    }

}
