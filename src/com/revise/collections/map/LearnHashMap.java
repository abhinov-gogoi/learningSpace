package com.revise.collections.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for(Map.Entry<String, Object> ent: map.entrySet()) {
                System.out.println(ent.getKey());
        }

        System.out.println(map);
    }
}
