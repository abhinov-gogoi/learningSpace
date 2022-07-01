package com.in28minutes.hibernate.repository.hibernate;


import com.in28minutes.hibernate.entity.Passport;
import com.in28minutes.hibernate.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    EntityManager em;

    public Student findById(int id) {
        return em.find(Student.class, id);
    }

    public void deleteById(int id) {
        Student student = findById(id);
        em.remove(student);
    }

    public void save(Student student) {
        if (student.getId() == null) {
            em.persist(student);
        } else {
            em.merge(student);
        }
    }

    public void saveStudentWithPassport() {
        Passport passport = new Passport("HDI83H");
        em.persist(passport);
        Student student = new Student("Mike");
        student.setPassport(passport);
        em.persist(student);
    }

}
