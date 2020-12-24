package com.prepbytes.week5;

import java.util.Scanner;

public class BooksLeft {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // no of Books
        long K = scan.nextLong(); // max chapter he can read
        long[] arr = new long[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextLong();
        }

        long count = 0L; // no of books read

        for(int i=0; i<N; i++){
            if(arr[i]>K)
                i = i+1000; // break loop
            else
                count++;
        }

        for(int i=N-1; i>=0; i--){
            if(arr[i]>K)
                i = i-1000; // break loop
            else
                count++;
        }

        // no of books left
        System.out.println(N-count);

    }
}
