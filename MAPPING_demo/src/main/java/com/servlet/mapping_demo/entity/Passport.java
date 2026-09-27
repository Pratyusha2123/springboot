package com.servlet.mapping_demo.entity;

import jakarta.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passportNumber;

    public Passport() {
    }

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
