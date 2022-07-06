package com.in28minutes.hibernate.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "last_updated_date")
    private LocalDate lastUpdatedDate;

    /**
     * By default on oneToMany relationships -> fetching is LAZY. ie all Reviews are not fetched while fetching a course.
     * can be solved by @Transactional on calling block or by forced EAGER loading
     */
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<Review> reviews = new ArrayList<Review>();

    /**
     * in manyToMany relationship, 2 JOIN TABLES  are created (STUDENT_COURSES and COURSES_STUDENT) for maintaining this relationship
     * mappedBy can be used to fix this and only one JOIN TABLE will be created
     *
     * mapped by can be used on either side as this is ManyToMany relationship
     * here I have used mapped by on COURSES to indicate that STUDENT is owning side of this manyToMany relationship
     * -> ie, id for course is present on STUDENT_COURSES table,
     * (this auto generated table name and column names can be changed on the owning side ie on the Student side with @JoinTable annotation)
     */
    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<Student>();

    public Course(String name) {
        this.name = name;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public void removeReview(Review review) {
        this.reviews.remove(review);
    }

    public LocalDate getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
