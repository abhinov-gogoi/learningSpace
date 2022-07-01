package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Passport;
import com.in28minutes.hibernate.entity.Student;
import com.in28minutes.hibernate.repository.hibernate.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.w3c.dom.Entity;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Section6.class)
public class Section6Test {

    @Autowired
    StudentRepository studentRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    public void retriveStudentAndPassportDetails() {
        Student student = studentRepository.findById(10001);
        /**
         * By default -> EAGER fetching - whenever student details are fetched, his passport details are also fetched eagerly
         * @OneToOne(fetch = FetchType.EAGER) is default
         */
        logger.info("student -> "+student);
        logger.info("passport details -> "+student.getPassport());

    }

    @Test
    @Transactional
    public void retrivePassportAndAssociatedStudentDetails() {
        Passport passport = em.find(Passport.class, 10001);
        Student student = passport.getStudent();
        logger.info("student -> "+student);


    }

}