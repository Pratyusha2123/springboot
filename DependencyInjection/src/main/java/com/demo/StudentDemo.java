package com.demo;

public class StudentDemo {

    // Student ID
    private int id;

    // Student Name
    private String name;

    // Reference Variable (Course Object)
    private Course course;

    // Constructor Injection
    public StudentDemo(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentDemo [id=" + id +
                ", name=" + name +
                ", course=" + course + "]";
    }
}
