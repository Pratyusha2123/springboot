package com.demoemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("data.xml");

        Employee emp = ac.getBean( "e1",Employee.class);
        System.out.println(emp);
    }
}