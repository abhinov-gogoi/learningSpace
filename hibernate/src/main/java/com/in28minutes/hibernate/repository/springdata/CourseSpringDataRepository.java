package com.in28minutes.hibernate.repository.springdata;

import com.in28minutes.hibernate.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseSpringDataRepository extends JpaRepository<Course, Integer> {
}
