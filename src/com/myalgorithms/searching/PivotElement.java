package com.myalgorithms.searching;
// https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

// for this array {4,5,6,7,8,1,2,3} 8 is pivot element
public class PivotElement {

    // function to get index of pivot in a rotated array.
    // for array {4,5,6,7,8,1,2,3} it returns 4 (index of 8)
    public static int indexOfPivotElement(int[] array, int leftIndex, int rightIndex){
        // base case
        if(leftIndex>rightIndex)
            return -1;
        if(leftIndex == rightIndex)
            return leftIndex; // array has only one element

        int mid = MidElement.indexOfMidElement(leftIndex, rightIndex);

        if(array[mid]>array[mid+1])
            return mid;
        if(array[mid]<array[mid-1])
            return mid-1;

        if(array[leftIndex]>=array[mid])
            return indexOfPivotElement(array, leftIndex, mid-1);
        else
            return indexOfPivotElement(array, mid+1, rightIndex);
    }

    // function to get value of pivot in a rotated array.
    public static int valueOfPivotElement(int[] array, int leftIndex, int rightIndex){
        int index = indexOfPivotElement(array, leftIndex, rightIndex);
        return array[index];
    }
}
