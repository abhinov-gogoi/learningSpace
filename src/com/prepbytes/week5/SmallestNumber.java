package com.prepbytes.week5;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findDuplicate(arr, n, k));
    }

    static int findDuplicate(int[] arr, int n, int k)
    {
        Arrays.sort(arr);

        int i = 0;
        while (i < n) {
            int j, count = 1;
            for (j = i+1; j<n && arr[j] == arr[i]; j++)
                count++;

            if (count == k)
                return arr[i];

            i = j;
        }
        return -1;
    }
}

