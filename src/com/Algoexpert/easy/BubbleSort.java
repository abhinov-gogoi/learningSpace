package com.Algoexpert.easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{5, 1, 3, 2, 4})));
    }

    public static int[] bubbleSort(int[] array) {
        for(int i =0 ; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>array[j]) {
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
