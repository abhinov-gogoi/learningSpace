package com.hackerrank;
// https://www.hackerrank.com/challenges/java-loops-i/problem

import java.io.IOException;
import java.util.Scanner;

public class loop_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
