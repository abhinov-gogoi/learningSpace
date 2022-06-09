package com.revise.comparableVcomparator;


import java.util.Date;

public class Employee implements Comparable<Employee>{

    String name;
    int id;
    Date joining_date;
    int salary;

    public Employee(String name, int id, Date joining_date, int salary) {
        this.name = name;
        this.id = id;
        this.joining_date = joining_date;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", joining_date=" + joining_date +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        return this.name.compareTo(that.name);
    }
}
