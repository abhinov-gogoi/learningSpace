package com.myalgorithms.revise;

import java.util.Arrays;

public class BubbleSortPractice1 {
    // driver code
    public static void main(String[] args){
        int[] arr = {6,2,5,3,9,0,1,5,2,6,9,23,67,90, 1,2,3,4,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i=0; i<array.length-1; i++){
                if(array[i]>array[i+1]){
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }

    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
