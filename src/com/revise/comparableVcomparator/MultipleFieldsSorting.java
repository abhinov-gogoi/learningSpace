package com.revise.comparableVcomparator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class MultipleFieldsSorting {
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Abhi", 4, dateFormat.parse("31/11/2014"), 1000));
        employees.add(new Employee("Abhi", 5, dateFormat.parse("06/09/2020"), 1000));
        employees.add(new Employee("Zack", 6, dateFormat.parse("23/05/1990"), 5000));
        employees.add(new Employee("Zack", 7, dateFormat.parse("23/05/1990"), 1000));
        employees.add(new Employee("Abhi", 1, dateFormat.parse("30/05/2022"), 1000));
        employees.add(new Employee("Abhi", 2, dateFormat.parse("23/05/1990"), 1000));
        employees.add(new Employee("Abhi", 2, dateFormat.parse("20/12/2015"), 5000));
        employees.add(new Employee("Abhi", 3, dateFormat.parse("20/12/2015"), 1000));


        Comparator<Employee> emp_name = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.compareTo(e2);
            }
        };

        Comparator<Employee> emp_joining_date = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.joining_date.compareTo(e2.joining_date);
            }
        };

        Comparator<Employee> emp_salary_comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.salary - e2.salary;
            }
        };

        Comparator<Employee> emp_id = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        };

        /**
         * Sorting order is  -
         * Name - in Ascending alphabetical order. If same name then we sort by
         * Joining date - earlier joining/older employee comes first. If joining date is same, we sort by
         * Salary - emp with higher salary comes first. If salary is same, we sort by
         * Employee ID at last
         *
         * Note : This chaining can be improved using some Java8 features next.
         */
        employees.sort(emp_name.thenComparing(emp_joining_date).thenComparing(emp_salary_comp.reversed()).thenComparing(emp_id));

        for (Employee emp:employees) {
            System.out.println(emp);
        }

    }
}
