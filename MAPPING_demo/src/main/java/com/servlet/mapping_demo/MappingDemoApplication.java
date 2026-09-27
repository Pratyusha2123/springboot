package com.servlet.mapping_demo;

import com.servlet.mapping_demo.entity.Passport;
import com.servlet.mapping_demo.entity.Student;
import com.servlet.mapping_demo.repository.PassportRepository;
import com.servlet.mapping_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingDemoApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PassportRepository passportRepository;

    public static void main(String[] args) {
        SpringApplication.run(MappingDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // Create Passport
        Passport passport = new Passport("IND123456");

        // Save Passport
        passportRepository.save(passport);

        // Create Student
        Student student = new Student("Pratyusha", passport);

        // Save Student
        studentRepository.save(student);

        System.out.println("Student and Passport saved successfully!");

        // Fetch Student
        Student s = studentRepository.findById(student.getId()).get();

        System.out.println(s);
    }
}
