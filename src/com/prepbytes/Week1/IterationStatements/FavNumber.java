package com.prepbytes.Week1.IterationStatements;

import java.util.Scanner;
import java.io.*;

public class FavNumber {
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); // Enter the no
            int rem;
            int sum = 0;
            int count = 0;

            while(n>=10){
                rem = n%10;
                n = n/10;
                if (rem == 5)
                    count++;
            }
            if(n != 5)
                System.out.println(count);
            else System.out.println(count+1);
        }

    }
}
