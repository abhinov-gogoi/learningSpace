package com.mosh.datastructures.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(45);
        arr.add(80);
        arr.add(2, 21);
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());

    }
}
