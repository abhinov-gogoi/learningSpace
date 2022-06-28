package com.in28minutes.hibernate.repository.hibernate;

import com.in28minutes.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepository {

    @PersistenceContext // https://stackoverflow.com/questions/31335211/autowired-vs-persistencecontext-for-entitymanager-bean
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class, id);
    }


}
