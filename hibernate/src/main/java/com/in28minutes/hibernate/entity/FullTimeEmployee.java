package com.in28minutes.hibernate.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class FullTimeEmployee extends Employee{

    private BigDecimal salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(BigDecimal salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(int id, String name, BigDecimal salary) {
        super(id, name);
        this.salary = salary;
    }

    public FullTimeEmployee(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
