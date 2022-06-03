package com.Algoexpert.easy;

import java.util.Arrays;

public class SortedSquareArray {
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] newArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            newArray[i] = array[i] * array[i];
        }
        Arrays.sort(newArray);
        return newArray;
    }

    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        sortedSquaredArray(array);
    }
}
