package br.com.rafael.floriano.spring_with_swagger_implementation.model;

import java.io.Serializable;


public class Plant implements Serializable {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public Plant() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
