package com.in28minutes.hibernate.repository.hibernate;

import com.in28minutes.hibernate.entity.Course;
import com.in28minutes.hibernate.entity.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
@Transactional
public class CourseRepository {

    Logger logger = LoggerFactory.getLogger(CourseRepository.class);

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
        // Due to @Transactional annotation - changes in the entity will always be synchronised to the database
        // Entity manager keeps track of changes within this code block
        // so this line will update the course in Database too !!
        course.setName("200 sec JAVA !!");
    }

    public void playWithEntityManagerFlushDetatch() {
        // flush() -> force the data to be persist in the database immediately
        Course course = new Course("100 second Java");
        em.persist(course);
        em.flush();

        course.setName("200 sec JAVA !!");
        em.flush();

        Course course1 = new Course("300 sec of Dart");
        em.persist(course1);
        em.flush();

        // detach() -> un-flushed changes made to the entity will not be synchronized to the database
        em.detach(course1);
        course1.setName("400 sec of DART !!");
        em.flush();

        /**
         * TODO -> Also see em.remove() and em.clear()and refresh() etc
         */
    }


    /**
     * TODO :: convert resource into map
     *
     * @return
     */
    public List nativeQuery() {
//        Query query = em.createNativeQuery("SELECT * FROM COURSE where id= :id");
        Query query = em.createNativeQuery("SELECT * FROM COURSE");
//        query.setParameter("id", 1);
        List resultList = query.getResultList();
        return resultList;
    }

    public void addReviewsForCourse(int course_id, Review... reviews) {
        Course course = findById(course_id);
        Stream.of(reviews).forEach(r -> {
            r.setCourse(course);
            em.persist(r); // we have not changed anything in the course, so no need to persist course, instead persist the reviews
        });
        logger.info("Reviews for the course_id " + course.getId() + " are -> {}", course.getReviews());



    }
}
