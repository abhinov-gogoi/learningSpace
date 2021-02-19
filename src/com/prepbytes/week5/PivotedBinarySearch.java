package com.prepbytes.week5;

import com.myalgorithms.searching.BinarySearch;
import com.myalgorithms.searching.PivotElement;

import java.util.Scanner;

public class PivotedBinarySearch {

    // driver class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            int result = pivotedBinarySearch(arr, K, 0, N-1);
            System.out.println(result);


        }
    }

    public static int pivotedBinarySearch(int[] array, int X, int leftIndex, int rightIndex){
        int pivotindex = PivotElement.indexOfPivotElement(array, leftIndex, rightIndex);

        // if the pivot is not found then array is not rotated at all
        // so use a simple binary search
        if(pivotindex==-1){
            return BinarySearch.getIndex(array,X, leftIndex, rightIndex);
        }

        if(X==array[pivotindex])
            return pivotindex;
        // if first element is less/equal to X call binary search on first half of sub-array
        if(array[0]<=X)
            return BinarySearch.getIndex(array, X, leftIndex, pivotindex-1);
        else // X lies in second half of sub-array
            return BinarySearch.getIndex(array, X, pivotindex+1, rightIndex);
    }

    // TEST

    // INPUT
//            1
//            10
//            5 6 7 8 9 10 1 2 3 4
//            9
    // OUTPUT
//            4
}
