package com.prepbytes.Week1;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        System.out.println(t);

        int[] arr = new int[t];

        for(int i=0; i<t; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(arr));

        int[] arr2 = arr;
        arr2[0] = 100;
        System.out.println(arr);
        System.out.println(arr2);
    }
}
