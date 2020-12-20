package com.prepbytes.Week1.IterationStatements;
import java.util.Scanner;

public class VPattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int i;
        int j;

        for(i=1; i<=5; i++){
            int noOfSpace = 2*(5-i);

            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            while(noOfSpace-->0){
                System.out.print(" ");
            }
            for(j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
