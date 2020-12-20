package com.myalgorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {4,1,6,2,7,3,8,9,0,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && array[j]>current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
