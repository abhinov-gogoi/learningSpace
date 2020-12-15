package com.myalgorithms.searching;

// Array should be sorted
public class BinarySearch {

    // binary search for X in array. Returns index of X
    // returns -1 if X is not found
    public static int getIndex(int[] array, int X, int leftIndex, int rightIndex){
        if (leftIndex > rightIndex)
            return -1;

        int mid = MidElement.indexOfMidElement(leftIndex, rightIndex);
        if (array[mid] == X)
            return mid;
        else if (X<array[mid])
            return getIndex(array, X, leftIndex, mid-1);
        else
            return getIndex(array, X, mid+1, rightIndex);
    }

    // binary search for X in array. Returns true if X is found
    public static boolean contains(int[] array, int X, int leftIndex, int rightIndex){
        if (leftIndex > rightIndex)
            return false;

        int mid = MidElement.indexOfMidElement(leftIndex, rightIndex);
        if (array[mid] == X)
            return true;
        else if (X<array[mid])
            return contains(array, X, leftIndex, mid-1);
        else
            return contains(array, X, mid+1, rightIndex);
    }


}
