package com.simplilearn.phase1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array= new int[5];
        array[0] = 100;
        array[1] = (int)34.2;
        array[2] = 'a';
        array[3] = (int)'d';

        System.out.println(Arrays.toString(array));
        array = new int[]{1, 2, (int)38.9, 4, 5};

        System.out.println(Arrays.toString(array)); // underlined variables means reassigned variables

    }
}
