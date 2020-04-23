package models;

import play.data.validation.Constraints;

import java.util.Date;

public class MovieModel {
    public Integer id;
    @Constraints.Required(message = "Please enter Movie name ")
    public String name;
    @Constraints.Required(message = "Please enter the producer name")
    public String producer;
    @Constraints.Required(message = "Please enter the Movie category")
    public String category;
    @Constraints.Required(message = "Please enter the director name")
    public String director;
    @Constraints.Required(message = "Please provide the release date")
    public Date releaseDate;

    public MovieModel(Integer id) {
        this.id = id;
    }

    public MovieModel() {
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
