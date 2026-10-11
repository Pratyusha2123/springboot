package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Load Spring XML Configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        // List Injection
        Programmer p1 = context.getBean("developerBean", Programmer.class);
        System.out.println(p1);

        // Set Injection
        Student s1 = context.getBean("studentBean", Student.class);
        System.out.println(s1);

        // map injection
        Teacher t1 = context.getBean("teacherBean", Teacher.class);
        System.out.println(t1);

        // Reference Injection
        StudentDemo sd = context.getBean("studentDemoBean", StudentDemo.class);
        System.out.println(sd);
    }
}
