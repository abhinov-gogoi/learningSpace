package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Course;
import com.in28minutes.hibernate.repository.hibernate.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateApp.class)
public class HibernateAppTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void findById_basic() {
        Course course = courseRepository.findById(1);
        assertEquals("Python", course.getName());
    }
}
