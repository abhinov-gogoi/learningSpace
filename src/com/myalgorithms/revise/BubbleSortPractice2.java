package com.myalgorithms.revise;

import java.util.Arrays;

public class BubbleSortPractice2 {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,9,0,2,3,7,8,6,2,4,3,5,9,8};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i=0; i<array.length-1; i++){
                if (array[i]>array[i+1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
