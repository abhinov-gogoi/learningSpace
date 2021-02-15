package com.mosh.generics;

import java.util.Arrays;

/*
    we may want to put constraints/restrictions in a generic class
    when some methods of the class makes sense only for that type of <T> or <E> value
 */

public class Constraints<T extends Number> { // see java.lang.Number

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    // this method adds all elements and returns the sum
    // it makes sense that we only use this generic class for numbers
    // so, Number constraint is added to T
    public T addAllElements() {
        T sum = null;
        for (T elem:items) {
//            sum += elem
        }
        return sum;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
