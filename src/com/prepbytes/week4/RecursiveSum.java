package com.prepbytes.week4;

import java.io.IOException;
import java.util.Scanner;

public class RecursiveSum {

    public static int addNumbers(int number){
        if(number>0)
            return number + addNumbers(number-1);
        else
            return number;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int number = sc.nextInt();
            int sum = addNumbers(number);
            System.out.println(sum);
        }
    }
}
