package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class HouseNumber {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int indexOfMin = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]<=min){
                    min = arr[i];
                    indexOfMin = i;
                }
            }
//            System.out.println(min);
            System.out.println(indexOfMin);
        }
    }
}
