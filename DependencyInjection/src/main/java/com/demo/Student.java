package com.demo;

import java.util.Set;

public class Student {

    // Student ID
    private int id;

    // Student Name
    private String name;

    // Set Collection
    private Set<String> subjects;

    // Constructor Injection
    public Student(int id, String name, Set<String> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", subjects=" + subjects + "]";
    }
}
