package com.revise.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <a href="https://www.youtube.com/watch?v=t1-YZ6bF-g0">...</a>
 * <p>
 * (Stream SOURCE)  -> (filter, sort, map) -> (COLLECT)
 * <p>
 * Source -> Streams can be created from Collections, List, Sets, ints, longs, arrays, lines of a dile etc
 * Stream operations are either intermediate or terminal
 * Zero or more INTERMEDIATE Operations - Filter, Sort, Map, -> returns another stream. So, we can chain multiple intermediate operations
 * Single TERMINAL Operation - Only ONE terminal operation at the end Such as foreach, collect, reduce
 * <p>
 * INTERMEDIATE operations
 * - anyMatch()
 * - distinct()
 * - findFirst()
 * - filter()
 * - flatmap()
 * - map()
 * - skip()
 * - sorted()
 * <p>
 * TERMINAL Operation -
 * - forEach() - applied the same method to each element
 * - collect() - saves the element into a collection
 * other options reduce the stream to a single element
 * - count()
 * - max()
 * - min()
 * - reduce()
 * - summaryStatistics() that only applies for integers
 */
public class Streams {

    public static void main(String[] args) {

        /**
         * 1. Integer stream
         */
        IntStream
                .range(1, 11)
                .forEach((a) -> {
                    System.out.println(a);
                });

        /**
         * 2. Integer stream with skip
         */
        IntStream
                .range(1, 11)
                .skip(3)
                .forEach(a -> System.out.println(a));

        /**
         * 3. Integer stream with sum
         */
        System.out.println(IntStream.range(1, 11).sum());

        /**
         * 4. Stream.of, sorted - (passing a comparator)
         */
        Stream.of("Abhinov", "Manish", "Zack", "Siv", "Pu")
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                }.reversed())
                .forEach(System.out::println);

        /**
         * 4. Stream.of, sorted, findFirst
         */
        Stream.of("Abhinov", "Manish", "Zack", "Siv", "Pu")
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                }.reversed())
                .findFirst()
                .ifPresent(System.out::println);

        /**
         * 5. Stream from an array then sort(), filter() and print()
         */
        String[] names = {"Abhinov", "Manish", "Zack", "Siv", "Pu"};
        Arrays.stream(names) // same as Stream.of(names)
                .filter((x) -> x.startsWith("A"))
                .forEach(System.out::println);

        /**
         * 6. Average of squares of an int array
         */
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        /**
         * 7. Stream from list then map(), filter(), sort() and print()
         */
        List<String> list_names = Arrays.asList("Abhinov", "Manish", "Zack", "Siv", "Au");

        list_names
                .stream()
                .map(String::toLowerCase)
                .filter(x->x.startsWith("a"))
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        /**
         * does not work. WHY ??
         */
//        Stream.of(list_names)
//                .map(x->x.toString().toLowerCase())
//                .filter(x->x.startsWith("a"))
//                .sorted(Collections.reverseOrder())
//                .forEach(System.out::println);

        /**
         * 8. Stream from list then map(), filter(), sort() and collect()
         */

        List<String> result = list_names
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
