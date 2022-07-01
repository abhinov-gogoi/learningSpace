package com.in28minutes.hibernate;


import com.in28minutes.hibernate.repository.hibernate.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Section6 implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(Section6.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.saveStudentWithPassport();
    }
}
