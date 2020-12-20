package com.prepbytes.week5;

import java.util.Scanner;

public class FloorOfANumber {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] arr = new int[n];
            // populate the input array
            for(int i=0; i< arr.length; i++){
                arr[i]= scan.nextInt();
            }
            boolean floorfound = false;
            // from x upto 0 (descending); search(binary) for that number within the input array
            // if present print the index
            for(int floor=x; floor>=0; floor--){
                // binary search
                int index_of_floor = search(arr, floor);
                if(index_of_floor != -1){
                    floorfound = true;
                    floor=-1; // if floor number is found break loop
                    System.out.println(index_of_floor);
                }
            }
            if(!floorfound){
                System.out.println(-1);
            }
        }
    }

    public static int search(int[] arr, int floor){
        return binarySearch(arr, floor, 0, arr.length-1);
    }

    public static int binarySearch(int[] array, int x, int left, int right) {
        if (left > right)
            return -1;

        int mid = left + ((right-left)/2);
        if (array[mid] == x)
            return mid;
        else if (x<array[mid])
            return binarySearch(array, x, left, mid-1);
        else
            return binarySearch(array, x, mid+1, right);
    }
}
