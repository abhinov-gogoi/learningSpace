package com.prepbytes.Week1.IterationStatements;
import java.util.Scanner;

public class PerfectNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no of Test cases
        while(t-->0){
            int sum = 0;
            int N = sc.nextInt(); // Enter a perfect no
            int i;
            int j;

            for(i=1; i<N; i++){
                for(j=1; j<=N; j++){
                    if(i*j==N){
                        sum = sum + i;
                    }
                }
            }
            if(sum == N)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}