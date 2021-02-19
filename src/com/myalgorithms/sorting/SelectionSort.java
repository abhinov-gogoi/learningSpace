package com.myalgorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,1,6,2,7,3,8,9,0,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] array){
        for(int i=0; i< array.length-1; i++){
            int min = array[i];
            int indexOfMin = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<min){
                    min=array[j];
                    indexOfMin = j;
                }
            }
            swap(array, i, indexOfMin);
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }
}
