package com.in28minutes.hibernate.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class PartTimeEmployee extends Employee {

    private BigDecimal hourlyWage;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(BigDecimal hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public PartTimeEmployee(int id, String name, BigDecimal hourlyWage) {
        super(id, name);
        this.hourlyWage = hourlyWage;
    }

    public PartTimeEmployee(String name, BigDecimal hourlyWage) {
        super(name);
        this.hourlyWage = hourlyWage;
    }

    public BigDecimal getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(BigDecimal hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

}
