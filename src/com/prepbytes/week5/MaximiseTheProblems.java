package com.prepbytes.week5;

import java.util.Scanner;

public class MaximiseTheProblems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int max = 240-K;
        int sum = 0;
        int count = 0;

        while(sum<=max){
            count++;
            sum+=count*5;
        }
        if(count-1<N)
            System.out.println(count-1);
        else
            System.out.println(N);
    }
}
