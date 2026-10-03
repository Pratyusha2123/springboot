package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Company {

    // Dependency Injection
    @Autowired
    private Employee employee;

    public Company() {
        System.out.println("Constructor Called : Company Bean Created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Method Called");
        employee.setName("Pratyusha");
    }

    public void display() {
        System.out.println("Bean Ready To Use");
        employee.display();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Method Called");
    }
}