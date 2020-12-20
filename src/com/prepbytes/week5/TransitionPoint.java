package com.prepbytes.week5;

import java.util.Scanner;

public class TransitionPoint{

    public static int binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right)
            return -1;

        int mid = left + (right-left)/2;
        if (array[mid] == x && (mid==0 || array[mid-1]==0))
            return mid;
        else if (x==array[mid])
            return binarySearchRecursive(array, x, left, mid-1);
        else
            return binarySearchRecursive(array, x, mid+1, right);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i]=sc.nextInt();
            }

            int firstindexofone;
            firstindexofone = binarySearchRecursive(arr, 1, 0, arr.length-1);
            System.out.println(firstindexofone);
        }
    }
}
