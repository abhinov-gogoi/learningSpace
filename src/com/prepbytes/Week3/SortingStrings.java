package com.prepbytes.Week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();

            int[] arr = new int[str.length()];
            for (int i=0; i<str.length(); i++){
                arr[i]=(str.charAt(i)-97);
            }
            Arrays.sort(arr);

            for(int i=arr.length-1; i>=0; i--){
               char c = (char)(arr[i]+97);
               System.out.print(c);
            }
            System.out.println();
        }
    }
}

