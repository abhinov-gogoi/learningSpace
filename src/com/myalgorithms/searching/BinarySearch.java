package com.myalgorithms.searching;

// Array should be sorted
public class BinarySearch {

    // binary search for num in array. Returns index of num
    // returns -1 if num is not found
    public static int getIndex(int[] array, int num, int leftIndex, int rightIndex){
        if (leftIndex > rightIndex)
            return -1;

        int mid = MidElement.indexOfMidElement(leftIndex, rightIndex);
        if (array[mid] == num)
            return mid;
        else if (num<array[mid])
            return getIndex(array, num, leftIndex, mid-1);
        else
            return getIndex(array, num, mid+1, rightIndex);
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

    public static boolean contains(int[] array, int num) {
        int result = getIndex(array, num, 0, array.length-1);
        if (result == -1)
            return false;
        else
            return true;
    }


}
