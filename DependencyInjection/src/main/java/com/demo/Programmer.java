package com.demo;

import java.util.List;

public class Programmer {

    // Programmer ID
    private int id;

    // Programmer Name
    private String name;

    // List of Technologies
    private List<String> tech;

    // Constructor Injection
    public Programmer(int id, String name, List<String> tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Technology List
    public List<String> getTech() {
        return tech;
    }

    // Print object details
    @Override
    public String toString() {
        return "Programmer [id=" + id +
                ", name=" + name +
                ", tech=" + tech + "]";
    }
}
