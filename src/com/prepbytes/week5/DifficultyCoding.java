package com.prepbytes.week5;

import java.util.Arrays;
import java.util.Scanner;

public class DifficultyCoding {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            boolean hardProblem;
            hardProblem = search(arr, 1);
            if(hardProblem) System.out.println("hard");
            else System.out.println("easy");
        }
    }

    public static boolean search(int[] arr, int x){
        return binarySearch(arr, x, 0, arr.length-1);
    }

    public static boolean binarySearch(int[] arr, int x, int left, int right){
        if(left>right) return false;
        int mid = left + (right-left)/2;

        if(arr[mid]==x)
            return true;
        else if (x<arr[mid])
            return binarySearch(arr, x, left, mid-1);
        else
            return binarySearch(arr, x, mid+1, right);
    }
}
