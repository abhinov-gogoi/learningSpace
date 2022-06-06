package com.Algoexpert.medium;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(firstDuplicateValue(arr));
    }

    public static int firstDuplicateValue(int[] array) {
        if (array.length <= 1) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    map.put(j, array[i]);
                    break;
                }
            }
        }

        int min_dup_index = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() <= min_dup_index) {
                min_dup_index = entry.getKey();
            }
        }

        if (min_dup_index == Integer.MAX_VALUE) {
            return -1;
        } else {
            return map.get(min_dup_index);
        }
    }
}
