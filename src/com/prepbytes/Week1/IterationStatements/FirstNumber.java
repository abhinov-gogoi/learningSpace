package com.prepbytes.Week1.IterationStatements;

import java.util.*;

public class FirstNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Test cases
        while(t-->0){
            int n = sc.nextInt(); // Enter the no
            int count = 0;
            while(n>=10){
                n = n/10;
                count++;
            }
            System.out.println(n);
        }
    }
}
