package com.revise.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    /**
     * no duplicates
     * order is maintained
     * Implements Linked list internally
     * Time Complexity - O(1) for basic operations
     */

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        set.remove(2);

        System.out.println(set.contains(32));


        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
    }
}
