package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Course;
import com.in28minutes.hibernate.repository.hibernate.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
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

    @Test
    @DirtiesContext // means that this test modifies the context, So tests like findById_basic will no longer work
    // Therefore @DirtiesContext refreshes the application context before running each method
    public void deleteById_basic() {
        courseRepository.deleteById(1);
        assertNull(courseRepository.findById(1));
    }

    @Test
    @DirtiesContext
    public void save_basic() {
        // get a course
        Course course = courseRepository.findById(1);
        assertEquals("Python", course.getName());

        // update the course name
        course.setName("Dart");
        courseRepository.save(course);

        // get updated course
        Course updated_course = courseRepository.findById(1);
        assertEquals("Dart", updated_course.getName());

    }
}
