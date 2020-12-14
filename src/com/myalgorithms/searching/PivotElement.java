package com.myalgorithms.searching;
// https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
// function to get index of pivot in a rotated array.
// for array {4,5,6,7,8,1,2,3} it returns 4 (index of 8). 8 is pivot

public class PivotElement {
    public int findPivot(int[] array, int leftIndex, int rightIndex){
        // base case
        if(leftIndex>rightIndex)
            return -1;
        if(leftIndex == rightIndex)
            return leftIndex; // array has only one element

        int mid = MidElement.indexOfMidElement(leftIndex, rightIndex);
        return -1;
    }
}
