package com.revise.comparableVcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * COMPARATOR interface is very similar to Comparator in the sense that it's used to sort Objects in a Collection
 *
 * It is used in cases where a Comparator is already implements in the class but we want to sort/compare objects based on a different parameter
 * OR in cases where the Sorting Class cannot be modified to implement Comparator interface - like a library class
 *
 * In such cases we use COMPARATOR - which is anonymous inner class and implement the logic there
 */
public class LearnComparator {
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

        Comparator<Student> standard_comparator = new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.standard > s2.standard) {
                    return 134;
                } else if (s1.standard < s2.standard) {
                    return -362;
                } else {
                    return 0;
                }
            }
        };

        /**
         *  The sort() method of Collections is overloaded to accept a Comparator object as the 2nd parameter as shown
         */
        Collections.sort(list_students, standard_comparator);

        for (Student s: list_students) {
            System.out.println(s.name);
        }
    }
}
