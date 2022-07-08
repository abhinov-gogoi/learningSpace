package com.in28minutes.hibernate.entity;


import javax.persistence.*;
import java.sql.Date;

//@MappedSuperclass // when we don't want parent/super class as an entity ( when we don't want the employee table, but only its subclass-entity tables)
@Entity
@Table(name = "employee")
/**
 * default InheritanceType strategy is SINGLE_TABLE
 */
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // makes use of UNION
//@Inheritance(strategy = InheritanceType.JOINED)
/**
 * discriminatory 'column name' in case of single table
 */
@DiscriminatorColumn(name = "EmployeeType")

public abstract class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    /**
     * No args constructor is must
     */
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
