package com.revise.collections.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        /**
         * random order / order is not maintained in HASHSET
         *
         * Time Complexity - O(1)
         */
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
