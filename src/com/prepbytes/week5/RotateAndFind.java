package com.prepbytes.week5;

import java.util.Scanner;

public class RotateAndFind {

    // driver class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            int result = pivotedBinarySearch(arr, K, 0, N - 1);
            System.out.println(result);
        }
    }

    public static int indexOfPivotElement(int[] array, int leftIndex, int rightIndex){
        // base case
        if(leftIndex>rightIndex)
            return -1;
        if(leftIndex == rightIndex)
            return leftIndex; // array has only one element

        int mid = leftIndex + (rightIndex-leftIndex)/2;

        if(array[mid]>array[mid+1])
            return mid;
        if(array[mid]<array[mid-1])
            return mid-1;

        if(array[leftIndex]>=array[mid])
            return indexOfPivotElement(array, leftIndex, mid-1);
        else
            return indexOfPivotElement(array, mid+1, rightIndex);
    }

    public static int binarySearch(int[] array, int X, int leftIndex, int rightIndex){
        if (leftIndex > rightIndex)
            return -1;

        int mid = leftIndex + (rightIndex-leftIndex)/2;
        if (array[mid] == X)
            return mid;
        else if (X<array[mid])
            return binarySearch(array, X, leftIndex, mid-1);
        else
            return binarySearch(array, X, mid+1, rightIndex);
    }

    public static int pivotedBinarySearch(int[] array, int X, int leftIndex, int rightIndex) {
        int pivotindex = indexOfPivotElement(array, leftIndex, rightIndex);

        // if the pivot is not found then array is not rotated at all
        // so use a simple binary search
        if (pivotindex == -1) {
            return binarySearch(array, X, leftIndex, rightIndex);
        }

        if (X == array[pivotindex])
            return pivotindex;
        // if first element is less/equal to X call binary search on first half of sub-array
        if (array[0] <= X)
            return binarySearch(array, X, leftIndex, pivotindex - 1);
        else // X lies in second half of sub-array
            return binarySearch(array, X, pivotindex + 1, rightIndex);
    }
}
