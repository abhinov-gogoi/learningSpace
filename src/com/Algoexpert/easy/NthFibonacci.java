package com.Algoexpert.easy;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println("\n"+getNthFib(10));
        // 0,1,1,2,3,5,8,13,21 ...
    }

    public static int getNthFib(int n) {
        // base cases
        int first = 0;
        int second = 1;
        int temp = 0;

        if(n==1){
            return first;
        }
        if (n==2) {
            return second;
        }

//        System.out.print(first+" "+second+" ");

        for(int i=3; i<=n; i++){
            temp = first+second;
            first = second;
            second = temp;
//            System.out.print(temp+" ");
        }
        return temp;
    }
}
