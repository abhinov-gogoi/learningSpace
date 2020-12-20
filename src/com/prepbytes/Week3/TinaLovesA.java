package com.prepbytes.Week3;

import java.io.IOException;
import java.util.Scanner;

public class TinaLovesA {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            int[] freq = new int[26];
            for(int i=0; i<str.length(); i++){
                freq[str.charAt(i)-97]++;
            }
            if(freq[0]>str.length()/2){
                System.out.println(str.length());
            }
            else{
                int count = 2*freq[0]-1;
                System.out.println(count);
            }
        }
    }
}

