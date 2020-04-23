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
    @Inject
    private HttpExecutionContext httpExecutionContext;

    public Result save(Http.Request request){
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).bindFromRequest(request);
        if(movieForm.hasErrors()){
            logger.error("errors = {}", movieForm.errors());
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.movies.createmovie.render(movieForm, request, messagesApi.preferred(request)));
        }

        MovieModel movie =  movieForm.get();
         this.movieService.addMovie(movie);
        request.flash().adding("success", "Record Added Successfully");
        return redirect(routes.MovieController.listAll());
    }
    public Result listAll() {
        List<MovieModel> movies = this.movieService.listAll();
        return ok(views.html.movies.index1.render(movies));
    }
    public Result createMovie(Http.Request request) {
        Form<MovieModel> movieModelForm = formFactory.form(MovieModel.class);
        return ok(views.html.movies.createmovie.render(movieModelForm, request, messagesApi.preferred(request)));
    }
    public Result updateMovie(Http.Request request,Integer id) {
        MovieModel movie=this.movieService.findById(id);
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).fill(movie);
        return ok(views.html.movies.updateMovie.render(movieForm,id,request, messagesApi.preferred(request)));
    }
    public Result deleteMovie(Http.Request request,Integer id){
        this.movieService.deleteMovie(id);
        request.flash().adding("success", "Record deleted Successfully");
        List<MovieModel> movies = this.movieService.listAll();
        return ok(index1.render(movies));
    }
    public Result update(Http.Request request,Integer id){
        Form<MovieModel> movieForm = this.formFactory.form(MovieModel.class).bindFromRequest(request);
        System.out.println("update method id"+id);
        if(movieForm.hasErrors()){
            logger.error("errors = {}", movieForm.errors());
            request.flash().adding("failed", "Constraints not satisfied!!!");
            return badRequest(views.html.movies.updateMovie.render(movieForm,id ,request, messagesApi.preferred(request)));
        }
        MovieModel movie =  movieForm.get();
        movie.setId(id);
        this.movieService.update(movie);
        request.flash().adding("success", "Record Added Successfully");
        return redirect(routes.MovieController.listAll());
    }
    public CompletionStage<Result> searchByName(String name){
        return supplyAsync(()->{
            MovieModel movie = this.movieService.searchByName(name);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseObject = mapper.convertValue(movie, JsonNode.class);
            ObjectNode result = Json.newObject();
            result.putPOJO("body", responseObject);
            return ok(result);
        }, httpExecutionContext.current());
    }
}
