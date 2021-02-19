package com.prepbytes.week4;

import java.io.IOException;
import java.util.Scanner;

public class Pattern {

    public static void printPattern(int number){
        System.out.print(number+" ");
        if(number<=0)
            return;
        printPattern(number-5);
        System.out.print(number+" ");
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int number = sc.nextInt();
            printPattern(number);
            System.out.println("");
        }
    }
}
