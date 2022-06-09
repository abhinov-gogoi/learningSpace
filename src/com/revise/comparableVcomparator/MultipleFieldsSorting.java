package com.revise.comparableVcomparator;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class MultipleFieldsSorting {
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Bizzy", 4, dateFormat.parse("31/11/2014"), 1000));
        employees.add(new Employee("Cassy", 5, dateFormat.parse("06/09/2022"), 1000));
        employees.add(new Employee("Carla", 6, dateFormat.parse("24/05/2012"), 1000));
        employees.add(new Employee("Zacky", 7, dateFormat.parse("23/05/2022"), 1000));
        employees.add(new Employee("Aazad", 1, dateFormat.parse("30/05/2022"), 1000));
        employees.add(new Employee("Aazad", 2, dateFormat.parse("30/04/2002"), 1000));
        employees.add(new Employee("Aazad", 2, dateFormat.parse("30/04/2002"), 5000));
        employees.add(new Employee("Bittu", 3, dateFormat.parse("20/12/2015"), 1000));


        Collections.sort(employees);

        System.out.println(employees);;
    }
}
