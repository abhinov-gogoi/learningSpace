package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class ScalarMultiplication {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

            int M = sc.nextInt(); // input no of rows
            int N = sc.nextInt(); // inout no of cols
            int K = sc.nextInt(); // inout Scalar
            int[] arr = new int[N]; // create 1D array with N elements
            while(M-->0){
                for(int index=0; index<N; index++){
                    arr[index]= sc.nextInt();
                    System.out.print(arr[index]*K+" ");
                }
                System.out.println();
            }


    }
}




//    int M = sc.nextInt(); // input no of rows
//    int N = sc.nextInt(); // inout no of cols
//    int K = sc.nextInt(); // inout Scalar
//    int[][] arr = new int[M][N]; // create 2D array with M*N cells
//            for(int row=0; row<M; row++){
//        for(int col=0; col<N; col++){
//        arr[row][col] = sc.nextInt();
//        }
//        }
//        System.out.println(Arrays.deepToString(arr));