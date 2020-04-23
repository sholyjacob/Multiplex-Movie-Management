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
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).bindFromRequest(request);
        if(multiplexForm.hasErrors()){
            logger.error("errors = {}", multiplexForm.errors());
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.multiplexes.createMultiplex.render(multiplexForm, request, messagesApi.preferred(request)));
        }
        MultiplexModel multiplexModel =  multiplexForm.get();
        this.multiplexService.addMultiplex(multiplexModel);
        request.flash().adding("success", "Record Added Successfully");
        return redirect(routes.MultiplexController.listAll());
    }
    public Result listAll() {
        List<MultiplexModel> multiplexModels = this.multiplexService.listAll();
        return ok(views.html.multiplexes.indexMultiplex.render(multiplexModels));
    }
    public Result createcMultiplex(Http.Request request) {
        Form<MultiplexModel> multiplexModelForm = formFactory.form(MultiplexModel.class);
        return ok(views.html.multiplexes.createMultiplex.render(multiplexModelForm, request, messagesApi.preferred(request)));
    }
    public Result updateMultiplex(Http.Request request,Integer id) {
        MultiplexModel multiplex = this.multiplexService.findById(id);
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).fill(multiplex);
        return ok(views.html.multiplexes.updateMultiplex.render(multiplexForm,request, id,messagesApi.preferred(request)));
    }
    public Result deleteMultiplex(Http.Request request,Integer id){
        this.multiplexService.deleteMultiplex(id);
        request.flash().adding("success", "Record deleted Successfully");
        List<MultiplexModel> multiplexes = this.multiplexService.listAll();
        return ok(views.html.multiplexes.indexMultiplex.render(multiplexes));
    }
    public Result update(Http.Request request,Integer id){
        Form<MultiplexModel> multiplexForm = this.formFactory.form(MultiplexModel.class).bindFromRequest(request);
        if(multiplexForm.hasErrors()){
            logger.error("errors = {}", multiplexForm.errors());
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.multiplexes.updateMultiplex.render(multiplexForm, request,id, messagesApi.preferred(request)));
        }

        MultiplexModel multiplexModel =  multiplexForm.get();
        multiplexModel.setId(id);
        this.multiplexService.updateMultiplex(multiplexModel);
        request.flash().adding("success", "Record Added Successfully");
        return redirect(routes.MultiplexController.listAll());
    }
    public CompletionStage<Result> searchByName(String name){
        return supplyAsync(()->{
            MultiplexModel multiplex = this.multiplexService.searchByName(name);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseObject = mapper.convertValue(multiplex, JsonNode.class);
            ObjectNode result = Json.newObject();
            result.putPOJO("body", responseObject);
            return ok(result);
        }, httpExecutionContext.current());
    }

}
