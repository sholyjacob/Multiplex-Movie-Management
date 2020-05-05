package service;

import entities.Multiplex;
import models.MultiplexModel;
import repository.JpaMultiplexRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MultiplexService {
    @Inject
    private JpaMultiplexRepository repository;
    public MultiplexModel addMultiplex(MultiplexModel multiplexModel){
        Multiplex multiplex=createMultiplex(multiplexModel);

        Multiplex multiplex_added = this.repository.insert(multiplex);
        multiplexModel.setId(multiplex_added.getId());
        return multiplexModel;
    }
    public List<MultiplexModel> listAll(){
        List<Multiplex> multiplexs= this.repository.list();
        return createMultiplexModels(multiplexs);
    }
    private List<MultiplexModel> createMultiplexModels(List<Multiplex> multiplexs){
        List<MultiplexModel> models=new ArrayList<>();
        for(Multiplex multiplex:multiplexs){
            MultiplexModel model=new MultiplexModel();
            model.setId(multiplex.getId());
            model.setName(multiplex.getName());
            model.setAddress(multiplex.getAddress());
            model.setNoOfSccreens(multiplex.getNoOfSccreens());
            models.add(model);
        }
        return models;
    }
    private Multiplex createMultiplex(MultiplexModel model){
        Multiplex multiplex = new Multiplex();
        multiplex.setId(model.getId());
        multiplex.setName(model.getName());
        multiplex.setAddress(model.getAddress());
        multiplex.setNoOfSccreens(model.getNoOfSccreens());
        return multiplex;
    }
    public void deleteMultiplex(Integer id){
        this.repository.delete(id);
    }
    public MultiplexModel findById(Integer id){
        Multiplex multiplex = this.repository.findById(id);
        List<Multiplex> multiplexes =new ArrayList<>();
        multiplexes.add(multiplex);
        return createMultiplexModels(multiplexes).get(0);
    }
    public MultiplexModel updateMultiplex(MultiplexModel multiplexModel){
        Multiplex multiplex=createMultiplex(multiplexModel);

        Multiplex multiplex_added = this.repository.upadate(multiplex);
        multiplexModel.setId(multiplex_added.getId());
        return multiplexModel;
    }
    public MultiplexModel searchByName(String name){
        List<Multiplex> multiplexs=this.repository.searchByName(name);
        MultiplexModel model =createMultiplexModels(multiplexs).get(0);
        return model;
    }
}
