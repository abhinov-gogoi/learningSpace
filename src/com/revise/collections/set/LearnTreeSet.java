package com.revise.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    /**
     * order is maintained
     * Implements BST internally
     * Time Complexity - O(LogN)
     */

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

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
