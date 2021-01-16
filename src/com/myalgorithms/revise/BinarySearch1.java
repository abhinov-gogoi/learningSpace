package com.myalgorithms.revise;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,9,0,2,3,7,8,6,2,4,3,5,9,8};
        Arrays.sort(arr);

        // array must be sorted for a binary search
        System.out.println(Arrays.toString(arr));

        // Do a binary search on arr for the number 5
        boolean result = binarySearch(arr, 11, 0, arr.length-1);
        System.out.println(result);
    }

    static boolean binarySearch(int[] array, int num, int left, int right) {
        if(left>right)
            return false;

        int mid = (left+right)/2;

        if (array[mid]==num)
            return true;

        if (array[mid]>num)
            return binarySearch(array, num, left, mid-1);
        else
            return binarySearch(array, num, left+1, right);
    }
}
