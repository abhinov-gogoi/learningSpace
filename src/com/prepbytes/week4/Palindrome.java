package com.prepbytes.week4;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input-->0){
            String str = sc.next();

            boolean isFascinating = true;
            for(int i=0; i<str.length(); i++){
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    isFascinating = false;
                    break;
                }
            }

            if(isFascinating)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
