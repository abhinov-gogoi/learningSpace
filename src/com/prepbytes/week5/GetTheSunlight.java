package com.prepbytes.week5;

import java.util.Scanner;

public class GetTheSunlight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {
            int n = scan.nextInt();
            long[] arr = new long[n];
            for(int i=0; i< arr.length; i++){
                arr[i]= scan.nextLong();
            }
            int count = 1;
            long tallest = arr[0];
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1] && arr[i+1]>tallest) {
                    count++;
                    tallest = arr[i+1];
                }
            }
            System.out.println(count);
        }
    }
}
