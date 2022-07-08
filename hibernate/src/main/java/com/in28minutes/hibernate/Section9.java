package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.FullTimeEmployee;
import com.in28minutes.hibernate.entity.PartTimeEmployee;
import com.in28minutes.hibernate.repository.hibernate.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Section9 implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        System.out.println("Section9 main");
        SpringApplication.run(Section8.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.insert(new FullTimeEmployee("Abhi", new BigDecimal(90000)));
        employeeRepository.insert(new PartTimeEmployee("Mike", new BigDecimal(15)));

    }
}
