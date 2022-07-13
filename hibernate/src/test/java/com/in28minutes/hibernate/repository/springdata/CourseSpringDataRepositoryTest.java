package com.in28minutes.hibernate.repository.springdata;

import com.in28minutes.hibernate.Section6;
import com.in28minutes.hibernate.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Section6.class)
public class CourseSpringDataRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(CourseSpringDataRepositoryTest.class);

    @Autowired
    CourseSpringDataRepository courseSpringDataRepository;

    @Test
    public void findById() {
        Optional<Course> courseOptional = courseSpringDataRepository.findById(10001);
        logger.info("{}", courseOptional.isPresent());
    }

}