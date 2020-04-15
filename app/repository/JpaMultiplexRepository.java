package repository;

import entities.Multiplex;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.function.Function;

@Singleton
public class JpaMultiplexRepository {
    @Inject
    private JPAApi jpaApi;

    private <T> T wrap(Function<EntityManager, T> function){
        return this.jpaApi.withTransaction(function);
    }
    public Multiplex insert(Multiplex multiplex){
        this.jpaApi.withTransaction(entityManager -> {
            entityManager.persist(multiplex);
        });
        return multiplex;
    }
    public List<Multiplex> list(){
        return this.wrap(entityManager -> {
            List<Multiplex> multiplexs =  entityManager.createQuery("select m from Multiplex m", Multiplex.class).getResultList();
            return multiplexs;
        });
    }
    public void delete(Integer id){
        this.jpaApi.withTransaction(entityManager -> {
            Multiplex multiplex= entityManager.createQuery("select m from Multiplex m where m.id =:id", Multiplex.class).setParameter("id",id).getSingleResult();
            entityManager.remove(multiplex);
        });
    }
    public Multiplex findById(Integer id){
        return this.jpaApi.withTransaction(entityManager -> {
            Multiplex multiplex= entityManager.createQuery("select m from Multiplex m where m.id =:id", Multiplex.class).setParameter("id",id).getSingleResult();
           return multiplex;
        });
    }
    public Multiplex upadate(Multiplex multiplex){
        this.jpaApi.withTransaction(entityManager -> {
            entityManager.merge(multiplex);
        });
        return multiplex;
    }
    public Multiplex searchByName(String name){
        return  this.wrap(entityManager -> {
            Multiplex multiplex =  entityManager.createQuery("select m from Multiplex m where m.name =:name", Multiplex.class).setParameter("name",name).getSingleResult();
            return multiplex;
        });
    }
}
