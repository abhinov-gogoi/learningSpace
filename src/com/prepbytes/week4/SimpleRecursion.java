package com.prepbytes.week4;

import java.io.IOException;
import java.util.Scanner;

public class SimpleRecursion {

    public static void printSum(int n){
        System.out.println(n);
        if(n==1)
            return;
        printSum(n-1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            printSum(n);
        }
    }
}