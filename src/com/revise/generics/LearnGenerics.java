package com.revise.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.youtube.com/watch?v=K1iu1kXkVoA">...</a>
 */
public class LearnGenerics {
    public static void main(String[] args) {
        /**
         * generic class example
         */
        Printer<Double> doublePrinter = new Printer<Double>(23.334);
        doublePrinter.print();

        /**
         * generic method example
         */
        aGenericMethod("heyyy");
        aGenericMethod(12.2332);

        /**
         * generic wildcard ? example
         */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
    }

    public static <T> void aGenericMethod(T thingToPrint) {
        System.out.println(thingToPrint+"!!!!!!!!");
    }

    /**
     * Although Object class is parent of all classes but here
     * We cannot use List<Object> and pass a List<Integer> ex - public static void printList(List<Object> list)
     *  - because List<Object> is not a parent class of a List<Integer>
     *
     * In this case we must use the WILDCARD symbol '?'
     * there can also be bounded wildcards - ex -  public static void printList(List<? extends Animal> list)
     */
    public static void printList(List<?> list) {
        System.out.println();
    }
}
