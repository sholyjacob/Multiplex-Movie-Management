package entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Multiplex {
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "multiplex")
    @JsonManagedReference
    List<Screen> screens;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String address;
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

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
}
