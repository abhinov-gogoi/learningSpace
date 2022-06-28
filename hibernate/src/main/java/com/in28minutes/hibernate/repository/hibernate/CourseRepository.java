package com.in28minutes.hibernate.repository.hibernate;

import com.in28minutes.hibernate.entity.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext // https://stackoverflow.com/questions/31335211/autowired-vs-persistencecontext-for-entitymanager-bean
    EntityManager em;

    public Course findById(int id) {
        return em.find(Course.class, id);
    }

    public void deleteById(int id) {
        Course course = findById(id);
        em.remove(course);
    }

    public void save(Course course) {
        if (course.getId() == null) {
            em.persist(course);  // insert
        } else {
            em.merge(course);    // update
        }
    }

    public void playWithEntityManager() {
        Course course = new Course("100 second Java");
        em.persist(course);
        // Due to @Transactional annotation -  Entity manager keeps track of changes within this code block
        // so this line will update the course in Database too !!
        course.setName("200 sec JAVA !!");
    }


}
