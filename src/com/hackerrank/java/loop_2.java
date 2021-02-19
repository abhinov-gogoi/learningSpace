package com.hackerrank.java;
// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;

public class loop_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a+b;
            System.out.print(res+" ");
            for(int i=2; i<=n; i++){
                res += Math.pow(2, i-1)*b;
                System.out.print(res+" ");
            }
            System.out.println();
        }
        in.close();
    }
}