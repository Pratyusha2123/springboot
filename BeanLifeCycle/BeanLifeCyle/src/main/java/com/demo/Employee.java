package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;

    // Constructor
    public Employee() {
        System.out.println("Constructor Called : Employee Bean Created");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter Method Called : Name Set");
    }

    public void display() {
        System.out.println("Employee Name : " + name);
    }
}