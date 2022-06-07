package com.revise.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        /**
         * same as HashMap but insertion order is maintained
         *
         * sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time
         */
        Map<String, Object> map = new TreeMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for(Map.Entry<String, Object> ent: map.entrySet()) {
            System.out.println(ent.getKey());
        }

        System.out.println(map);
    }
}
