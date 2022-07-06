package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Review;
import com.in28minutes.hibernate.repository.hibernate.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Section8 implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {
        System.out.println("Section8 main");
        SpringApplication.run(Section8.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Review review1 = new Review("Fabolous", "4.5");
        Review review2 = new Review("Good work", "3");

        courseRepository.addReviewsForCourse(10001, review1, review2);
    }
}
