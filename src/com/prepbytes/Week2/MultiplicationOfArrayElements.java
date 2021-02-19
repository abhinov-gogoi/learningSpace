package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class MultiplicationOfArrayElements {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int res = 1;
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
                res = res * arr[i];
            }
            System.out.println(res);
        }
    }
}


