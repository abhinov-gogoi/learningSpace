package com.revise.comparableVcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Java Comparable interface is used to order the objects of the user-defined class.
 * This interface is found in java.lang package and contains only one method named compareTo(Object).
 * It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 * For example, it may be roll no, name, age or anything else.
 */
public class LearnComparable {
    public static void main(String[] args) {

        Student student4 = new Student("Dan", 4, 2);
        Student student5 = new Student("Elle", 5, 9);
        Student student1 = new Student("Abhi", 1, 5);
        Student student2 = new Student("Biki", 2, 6);
        Student student3 = new Student("Cessy", 3, 1);

        List<Student> list_students = new ArrayList<>();
        list_students.add(student1);
        list_students.add(student2);
        list_students.add(student3);
        list_students.add(student4);
        list_students.add(student5);

        /**
         * we can sort the students list because Student class implements COMPARABLE interface
         */
        Collections.sort(list_students);

        for (Student s: list_students) {
            System.out.println(s.name);
        }
    }
}
