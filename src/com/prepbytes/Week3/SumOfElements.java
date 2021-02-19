package com.prepbytes.Week3;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int N = sc.nextInt();
            BigInteger[] arr = new BigInteger[N];
            BigInteger sum, element;
            sum = new BigInteger("0");
            for(int i=0; i<arr.length; i++){
                element = new BigInteger(String.valueOf(sc.next()));
                sum = sum.add(element);
            }
            System.out.println(sum);
        }
    }
}

