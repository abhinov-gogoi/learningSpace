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
}
