package com.in28minutes.hibernate.repository.hibernate;

import com.in28minutes.hibernate.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

    private Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);

    @Autowired
    EntityManager entityManager;

    public void insert(Employee employee) {
        entityManager.persist(employee);
    }

    public List<Employee> getAllEmployees() {
        return entityManager.createNamedQuery("select e from Employee e", Employee.class).getResultList();
    }


}
