package com.myalgorithms.sorting;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        boolean isSorted= false;
        while(!isSorted){
            isSorted = true;
            for(int i=0; i<array.length-1; i++){
                if(array[i]>array[i+1]){
                    // swap
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {4,1,6,2,7,3,8,9,0,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
