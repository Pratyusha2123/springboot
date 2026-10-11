package com.demo;

import java.util.Map;

public class Teacher {

    // Teacher ID
    private int id;

    // Teacher Name
    private String name;

    // Map Collection
    private Map<String, String> subjects;

    // Constructor Injection
    public Teacher(int id, String name, Map<String, String> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
    }
}
