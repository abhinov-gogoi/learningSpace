package com.prepbytes.week4;

import java.util.Scanner;

public class Factorial {

    public static void factNum(int input_Number, long res){
        if(input_Number==1){
            System.out.println(res);
            return;
        }
        res = res * input_Number;
        factNum(input_Number-1, res);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int  testcase = sc.nextInt();
        while(testcase-->0){
            int input_Number = sc.nextInt();
            long res = 1L;
            factNum(input_Number, res);
        }
    }
}
