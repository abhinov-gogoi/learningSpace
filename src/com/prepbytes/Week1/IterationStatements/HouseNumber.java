package com.prepbytes.Week1.IterationStatements;

import java.util.*;

public class HouseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt(); // input
            int currentNumberUnderCheck = N;
            long totalDigits = 0L;

            while(currentNumberUnderCheck>0){
                N = currentNumberUnderCheck;
                while (N != 0) {
                    // checking total digits in currentNumberUnderCheck
                    N = N / 10;
                    totalDigits++;
                }
//                System.out.println("Total digits up to "+currentNumberUnderCheck+" (decreasing) is "+totalDigits);
                currentNumberUnderCheck--;
            }
            System.out.println(totalDigits);
        }
    }
}







