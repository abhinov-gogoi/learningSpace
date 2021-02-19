package com.prepbytes.week6;

import java.util.Scanner;

public class Median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, arr.length-1);
        System.out.println(arr[N/2]);

    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        swap(arr,i+1, high);

        return i + 1;
    }

    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }
}
