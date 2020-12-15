package com.myalgorithms.searching;

// https://www.geeksforgeeks.org/start-end-start2-preferrable-method-calculating-middle-array-start-end2/
public class MidElement {

    // Returns index of mid element in array
    public static int indexOfMidElement(int leftIndex, int rightIndex){
        int midIndex;
        return midIndex = leftIndex + (rightIndex-leftIndex)/2;  // to prevent Integer Overflow error
    }

    // Returns value of mid element in array
    public static int valueOfMidElement(int[] array, int leftIndex, int rightIndex){
        int index = indexOfMidElement(leftIndex, rightIndex);
        return array[index];
    }
}
