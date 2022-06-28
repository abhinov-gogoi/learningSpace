package com.revise.java8.functionalProgramming;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Consumer  - a functional interface (lambda) that accepts a single input and returns nothing. ex forEach()
 * Predicate - a functional interface (lambda) that accepts a single input and returns a boolean; contains test() method
 * Supplier  - a functional interface (lambda) that accepts a single input and returns a value/null; contains apply() method
 * Function  - a functional interface (lambda) that accepts nothing but returns a value; contains get() method
 */
public class FunctionalProgramming {
    public static void main(String[] args) {
        String[] names = {"Abhinov", "Manish", "Zack", "Siv", "Au"};

        /**
         * 1. Consumer - forEach() method accepts a CONSUMER. ie accepts a name and returns nothing , Just consumes/prints the name
         */
        Stream.of(names).forEach((a)-> {
            System.out.print(a+" ");
        });

        /**
         * 2. Predicate - filter() method accepts a PREDICATE. ie accepts a name and returns the name if condition is true
         */
        Stream<String> predicate_example = Stream.of(names).filter((a) -> a.startsWith("A"));
        System.out.println("\n"+Arrays.toString(predicate_example.toArray()));

        /**
         * 3. Supplier - accepts nothing but returns a value
         * we can create an infinite stream using Stream.generate() method
         * this method accepts a supplier -> the supplier accepts nothing but returns a random uuid here
         * Note that generate() method gives an infinite stream, so we must limit it
         */
        Stream<String> supplier_example = Stream.generate(() ->  UUID.randomUUID().toString().substring(0, 5).toUpperCase());
        System.out.println((Arrays.toString(supplier_example.limit(5).toArray())));

        /**
         * 4. Function - takes in a value, returns another value after performing an operation on that value
         */
        Stream<String> function_example = Stream.of(names).map(a -> a.toUpperCase());
        System.out.println(Arrays.toString(function_example.toArray()));

    }
}
