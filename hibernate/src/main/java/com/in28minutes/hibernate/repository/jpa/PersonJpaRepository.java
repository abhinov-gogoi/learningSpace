package com.in28minutes.hibernate.repository.jpa;

import com.in28minutes.hibernate.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    /**
     * connect to db
     */
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public List<Person> findAll() {
        TypedQuery<Person> find_all_persons = entityManager.createNamedQuery("find_all_persons", Person.class);
        return find_all_persons.getResultList();
    }

    /**
     * merge - update if exists OR insert if not exists
     */
    public Person upsert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }
}
