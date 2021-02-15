package com.mosh.datastructures.arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(3);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(2);
        arr.removeAt(2);
        arr.print();
        System.out.println("item is at "+arr.indexOf(2));

    }
}
