package com.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReplaceXML {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Employee employee() {

        return new Employee(100, address());

    }

}