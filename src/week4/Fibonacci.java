package week4;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciNumber(int number){
        if(number<=1){
            return number;
        }
        return fibonacciNumber(number-1) + fibonacciNumber(number-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-->0){
            int input_Number = sc.nextInt();
            System.out.println(fibonacciNumber(input_Number));
        }
    }
}
