package com.in28minutes.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue
    private Integer id;

    private String rating;

    private String description;

    public Review(String name, String rating) {
        this.rating = rating;
        this.description = name;
    }

    public Review() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "id=" + id + ", description=" + description;
    }
}
