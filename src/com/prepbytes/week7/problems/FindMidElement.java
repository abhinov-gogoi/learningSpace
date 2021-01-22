package com.prepbytes.week7.problems;

import java.util.Scanner;

public class FindMidElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int mid;
            if (N%2==0)
                mid = (N/2)+1;
            else
                mid = N/2;
        }
    }
}
