package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class EvenAndOddElements {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int j = 0; j<arr.length; j++){
                if(arr[j]%2==0)
                    System.out.print(arr[j]+" ");
            }
            System.out.println("");
            for(int j = 0; j<arr.length; j++){
                if(arr[j]%2!=0)
                    System.out.print(arr[j]+" ");
        }
    }
}
