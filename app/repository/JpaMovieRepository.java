package repository;

import entities.Movie;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.function.Function;

@Singleton
public class JpaMovieRepository {
    @Inject
    private JPAApi jpaApi;

    private <T> T wrap(Function<EntityManager, T> function){
        return this.jpaApi.withTransaction(function);
    }

    public Movie insert(Movie movie){
        this.jpaApi.withTransaction(entityManager -> {
            entityManager.persist(movie);
        });
       this.wrap(entityManager -> {
            List<Movie> movies =  entityManager.createQuery("select m from Movie m", Movie.class).getResultList();
            return movies;
        });
        return movie;
    }
    public List<Movie> list(){
        return this.wrap(entityManager -> {
            List<Movie> movies =  entityManager.createQuery("select m from Movie m", Movie.class).getResultList();
            return movies;
        });
    }
    public void delete(Integer id){
        this.jpaApi.withTransaction(entityManager -> {
           Movie movie= entityManager.createQuery("select m from Movie m where m.id =:id", Movie.class).setParameter("id",id).getSingleResult();
            entityManager.remove(movie);
        });
    }
    public Movie findById(Integer id){
       return this.jpaApi.withTransaction(entityManager -> {
            Movie movie= entityManager.createQuery("select m from Movie m where m.id =:id", Movie.class).setParameter("id",id).getSingleResult();
            return movie;
        });

    }
    public Movie update(Movie movie){
        this.jpaApi.withTransaction(entityManager -> {
            entityManager.merge(movie);
        });
        this.wrap(entityManager -> {
            List<Movie> movies =  entityManager.createQuery("select m from Movie m", Movie.class).getResultList();
            return movies;
        });
        return movie;
    }
    public Movie searchByName(String name){
       return  this.wrap(entityManager -> {
            Movie movie =  entityManager.createQuery("select m from Movie m where m.name =:name", Movie.class).setParameter("name",name).getSingleResult();
            return movie;
        });
    }
}
