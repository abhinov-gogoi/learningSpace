package com.prepbytes.Week1.IterationStatements;

import java.util.Scanner;
import java.io.*;

public class OnePattern {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int j = 0;

            for(i=0; i<=4; i++){
                for(j=0; j<=i; j++){
                    System.out.print("1 ");
                }
            System.out.println("");
        }
    }
}