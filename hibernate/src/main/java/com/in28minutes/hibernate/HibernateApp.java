package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Course;
import com.in28minutes.hibernate.repository.hibernate.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApp implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;

    private Logger logger = LoggerFactory.getLogger(HibernateApp.class);

    public static void main(String[] args) {
        SpringApplication.run(HibernateApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        courseRepository.save(new Course("Python"));

        courseRepository.playWithEntityManager();

        System.out.println("HibernateApp");
        Course course = courseRepository.findById(1);
        logger.info("Course -> {}",course);

    }
}
