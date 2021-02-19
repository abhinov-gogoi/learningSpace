package com.mosh.generics;

import java.util.Arrays;

// <T> or <E> same
public class GenericList <T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
