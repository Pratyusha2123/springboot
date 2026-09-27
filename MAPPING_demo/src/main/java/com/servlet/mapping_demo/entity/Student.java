package com.servlet.mapping_demo.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne
    private Passport passport;

    public Student() {
    }

    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passport=" + passport +
                '}';
    }
}
