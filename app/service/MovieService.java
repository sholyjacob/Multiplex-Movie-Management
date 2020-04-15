package service;

import entities.Movie;
import models.MovieModel;
import repository.JpaMovieRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MovieService {
    @Inject
    private JpaMovieRepository movieRepo;
    public MovieModel addMovie(MovieModel movieModel){
        Movie movie=createMovie(movieModel);
        Movie movie_Added = this.movieRepo.insert(movie);
        movieModel.setId(movie_Added.getId());
    return movieModel;
    }
    public List<MovieModel> listAll(){
        List<Movie> movies= this.movieRepo.list();
        return createMovieModels(movies);
    }
    private List<MovieModel> createMovieModels(List<Movie> movies){
        List<MovieModel> models=new ArrayList<>();
        for(Movie movie:movies){
            MovieModel model=new MovieModel();
            model.setId(movie.getId());
            model.setName(movie.getName());
            model.setDirector(movie.getDirector());
            model.setProducer(movie.getProducer());
            model.setReleaseDate(movie.getReleaseDate());
            models.add(model);
        }

    return models;
}
    private Movie createMovie(MovieModel model){
        Movie movie = new Movie();
        movie.setId(model.getId());
        movie.setName(model.getName());
        movie.setCategory(model.getCategory());
   movie.setProducer(model.getProducer());
        movie.setDirector(model.getDirector());
        movie.setReleaseDate(model.getReleaseDate());
        return movie;
    }
    public void deleteMovie(Integer id){
    this.movieRepo.delete(id);
    }
    public MovieModel findById(Integer id){
        Movie movie=this.movieRepo.findById(id);
        List<Movie> movies =new ArrayList<>();
        movies.add(movie);
        MovieModel model =createMovieModels(movies).get(0);
        return model;
    }

    public MovieModel upadte(MovieModel movieModel){
        Movie movie=createMovie(movieModel);
        Movie movie_Added = this.movieRepo.update(movie);
        movieModel.setId(movie_Added.getId());
        return movieModel;
    }
    public MovieModel searchByName(String name){
        Movie movie=this.movieRepo.searchByName(name);
        List<Movie> movies =new ArrayList<>();
        movies.add(movie);
        MovieModel model =createMovieModels(movies).get(0);
        return model;
    }
}
