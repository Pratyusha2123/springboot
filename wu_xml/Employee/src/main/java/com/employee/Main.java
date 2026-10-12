package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReplaceXML.class);

        Employee emp = context.getBean(Employee.class);

        emp.getDependency();

    }
}