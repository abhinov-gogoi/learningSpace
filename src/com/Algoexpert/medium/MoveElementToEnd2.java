package com.Algoexpert.medium;

import java.util.Arrays;

public class MoveElementToEnd2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveElemToEnd(new int[]{2, 1, 2, 2, 2, 3, 4, 2})));
    }

    public static int[] moveElemToEnd(int[] array) {
        for(int i =0 ; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==2) {
                    // swap
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
}
