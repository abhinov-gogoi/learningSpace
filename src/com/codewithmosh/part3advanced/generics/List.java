package com.mosh.generics;

import java.util.Arrays;

public class List {
    // This list is Not generic, it can store only integers
    int size;
    private int[] items = new int[size];
    int count;

    public List(int size) {
        this.size = size;
    }

    public void addItem(int item) {
        items[count++] = item;
    }

    public void print() {
         Arrays.toString(items);
    }





}
