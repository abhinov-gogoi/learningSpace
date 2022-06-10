package com.revise.java8.functionalProgramming;

import com.revise.java8.streams.Streams;

import java.util.stream.Stream;

/**
 * Consumer  - a functional interface (lambda) that accepts a single input and returns no value. ex forEach()
 * Predicate - a functional interface (lambda) that represents a boolean-valued-function of one argument.
 * Supplier - todo
 * Function - todo
 */
public class FunctionalProgramming {
    public static void main(String[] args) {
        String[] names = {"Abhinov", "Manish", "Zack", "Siv", "Au"};

        /**
         * 1. Consumer - forEach() method accepts a CONSUMER. ie accepts a name and returns nothing , Just consumes/prints the name
         */
        Stream.of(names).forEach((a)-> {
            System.out.println(a);
        });

        /**
         * 2. Predicate - filter() method accepts a PREDICATE. ie accepts a name and returns the name if condition is true
         */
        Stream.of(names).filter((a)->a.startsWith("A"));

        /**
         * 3. Supplier - TODO
         */

        /**
         * 4. Function - TODO
         */

    }
}
