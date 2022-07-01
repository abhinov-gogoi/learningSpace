package com.in28minutes.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String number;

    /**
     * mappedBy -> both student and passport has oneToOne relationship in tables
     * mappedBy is written on the 'non-owning' side of the relation to
     * indicate that Student is owning side between student-passport relation (the key for the relationship is on the Student table)
     *

     "MappedBy signals hibernate that the key for the relationship is on the other side"

     * i.e : Student table has passport_id column
     *
     * Note that even passport could have student_id column due to one-to-one mapping ; if we don't use the mappedBy here like (@OneToOne(fetch = FetchType.EAGER))
     * but this is duplicating data on db which is considered a bad practice
     */
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "passport")
    private Student student;

    public Passport(String number) {
        this.number = number;
    }

    public Passport() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "id=" + id + ", number=" + number;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
