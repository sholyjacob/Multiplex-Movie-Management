package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.MovieModel;
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
import service.MovieService;
import views.html.movies.index1;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class MovieController extends Controller {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Inject
    public MovieService movieService;
    @Inject
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;
    // Http Execution Context : to maintain an http context for async
    @Inject
    private HttpExecutionContext httpExecutionContext;

    public Result save(Http.Request request){
        // fetch the virtual form
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).bindFromRequest(request);

        // validate the constraint status
        if(movieForm.hasErrors()){
            // reflect back same view page
            logger.error("errors = {}", movieForm.errors());
            // show a flash message
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.movies.createmovie.render(movieForm, request, messagesApi.preferred(request)));
        }

        // fetch product object
        MovieModel movie =  movieForm.get();
        // add to repo
        // ProductRepository.getProducts().add(product);

        // send this service layer
         this.movieService.addMovie(movie);
        request.flash().adding("success", "Record Added Successfully");

        // redirect it to list page
        return redirect(routes.MovieController.listAll());
       /* JsonNode json = request.body().asJson();
        json.get
        MovieModel model =Json.fromJson(json,MovieModel.class);
        System.out.println(model.getName()+"*************************");
        //Optional<MovieModel> movie = request.body().parseJson(MovieModel.class);
        movieService.addMovie(model);
        return ok("movie added");*/
    }
    public Result listAll() {
    List<MovieModel> movies = this.movieService.listAll();
    return ok(views.html.movies.index1.render(movies));
    }
    public Result createMovie(Http.Request request) {
        // createmovie a Virtual form from Product Model
        Form<MovieModel> movieModelForm = formFactory.form(MovieModel.class);
        // return response :  render-view
        return ok(views.html.movies.createmovie.render(movieModelForm, request, messagesApi.preferred(request)));
    }
    public Result updateMovie(Http.Request request,Integer id) {
        // createmovie a Virtual form from Product Model
        MovieModel movie=this.movieService.findById(id);
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).fill(movie);
        // return response :  render-view
        return ok(views.html.movies.updateMovie.render(movieForm,request, messagesApi.preferred(request)));
    }
    public Result deleteMovie(Http.Request request,Integer id){
        this.movieService.deleteMovie(id);
        request.flash().adding("success", "Record deleted Successfully");
        List<MovieModel> movies = this.movieService.listAll();
        return ok(index1.render(movies));
    }
    public Result update(Http.Request request){
        // fetch the virtual form
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).bindFromRequest(request);

        // validate the constraint status
        if(movieForm.hasErrors()){
            // reflect back same view page
            logger.error("errors = {}", movieForm.errors());
            // show a flash message
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.movies.updateMovie.render(movieForm, request, messagesApi.preferred(request)));
        }

        // fetch product object
        MovieModel movie =  movieForm.get();
        // add to repo
        // ProductRepository.getProducts().add(product);

        // send this service layer
        this.movieService.upadte(movie);
        request.flash().adding("success", "Record Added Successfully");

        // redirect it to list page
        return redirect(routes.MovieController.listAll());
       /* JsonNode json = request.body().asJson();
        json.get
        MovieModel model =Json.fromJson(json,MovieModel.class);
        System.out.println(model.getName()+"*************************");
        //Optional<MovieModel> movie = request.body().parseJson(MovieModel.class);
        movieService.addMovie(model);
        return ok("movie added");*/
    }

    //rest call
    public CompletionStage<Result> searchByName(String name){
        // wrap whole code to return an async response
        /*return supplyAsync(()->{
            // fetch records from DB
            List<MovieModel> products = this.movieService.listAll();
            // Mapper object to convert Java List into JSON array
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseObject = mapper.convertValue(products, JsonNode.class);
            ObjectNode result = Json.newObject();
            result.putPOJO("body", responseObject);
            return ok(result);
        }, httpExecutionContext.current());*/
        return supplyAsync(()->{
            // fetch records from DB
            MovieModel movie = this.movieService.searchByName(name);
            // Mapper object to convert Java List into JSON array
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseObject = mapper.convertValue(movie, JsonNode.class);
            ObjectNode result = Json.newObject();
            result.putPOJO("body", responseObject);
            return ok(result);
        }, httpExecutionContext.current());
    }
}
