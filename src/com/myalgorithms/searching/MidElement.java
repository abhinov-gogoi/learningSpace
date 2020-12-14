package com.myalgorithms.searching;

public class MidElement {

    // Returns index of mid element in array
    public static int indexOfMidElement(int leftIndex, int rightIndex){
        int midIndex;
        return midIndex = leftIndex + (rightIndex-leftIndex)/2;
    }

    // Returns value of mid element in array
    public static int valueOfMidElement(int[] array, int leftIndex, int rightIndex){
        int index = indexOfMidElement(leftIndex, rightIndex);
        return array[index];
    }
}
