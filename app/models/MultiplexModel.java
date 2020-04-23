package models;

import play.data.validation.Constraints;

public class MultiplexModel {
    public Integer id;
    @Constraints.Required(message = "Please enter multiplex name")
    public String name;
    public MultiplexModel(Integer id) {
        this.id = id;
    }
    public MultiplexModel() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Constraints.Required(message = "Please enter address")
    public String address;
    @Constraints.Required(message = "Please enter no of screens")
    public Integer noOfSccreens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNoOfSccreens() {
        return noOfSccreens;
    }

    public void setNoOfSccreens(Integer noOfSccreens) {
        this.noOfSccreens = noOfSccreens;
    }
}
