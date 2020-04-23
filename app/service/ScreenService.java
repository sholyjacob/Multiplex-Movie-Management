package service;


import entities.Movie;
import entities.Screen;
import models.ScreenDTO;
import models.ScreenModel;
import models.SearchItem;
import repository.JpaMovieRepository;
import repository.JpaMultiplexRepository;
import repository.ScreenRepository;
import org.modelmapper.ModelMapper;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class ScreenService {
    @Inject
    ModelMapper modelMapper;
    @Inject
    ScreenRepository screenRepository;
    @Inject
    JpaMovieRepository movieRepository;
    @Inject
    JpaMultiplexRepository multiplexRepository;

    public ScreenModel getScreenByMultiplexAndScreenNumber(Integer multiplexID, Integer screenNumber) {
        Screen screen = screenRepository.getScreenByMultiplexAndScreenNumber(multiplexID, screenNumber);
        if (screen == null) {
            return null;
        } else {
            return modelMapper.map(screen, ScreenModel.class);
        }

    }

    public void addScreen(ScreenModel screen) {
        screenRepository.add(modelMapper.map(screen, Screen.class));
    }

    public void delete(Integer movieID, Integer multiplexID, Integer screenNumber) {
        screenRepository.delete(movieID, multiplexID, screenNumber);
    }

    public List<SearchItem> getSearchResult(String searchString, int movieOrMulti) {
        if (movieOrMulti == 1) {
            return movieRepository.searchByName(searchString).stream().map(m -> {
                mapp(m);
                return  modelMapper.map(m, SearchItem.class);
            }).collect(Collectors.toList());
        } else {
            return multiplexRepository.searchByName(searchString).stream().map(m -> modelMapper.map(m, SearchItem.class)).collect(Collectors.toList());
        }
    }
    public SearchItem mapp(Movie movie) {
        SearchItem searchItem = modelMapper.map(movie, SearchItem.class);
        if (searchItem != null && movie != null && movie.getScreens() != null) {
            List<ScreenDTO> screenDTOS = movie.getScreens().stream().map(m -> modelMapper.map(movie, ScreenDTO.class)).collect(Collectors.toList());
            searchItem.setScreens(screenDTOS);
        }
        return searchItem;
    }

}
