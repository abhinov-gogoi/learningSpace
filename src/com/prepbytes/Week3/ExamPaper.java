package com.prepbytes.Week3;

import java.io.IOException;
import java.util.Scanner;

public class ExamPaper {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            int count = 0;
            for(int i=0; i<(str.length()/2); i++) {
                int rightChar = str.charAt(str.length()-1 - i);
                int leftChar = str.charAt(i);
                if (leftChar != rightChar)
                    count+=(Math.abs(leftChar-rightChar));
            }
            System.out.println(count);
        }
    }

}













//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//        while (t-->0){
//                String str = sc.next();
//                int count = 0;
//
//                for(int i=0; i<(str.length()/2); i++) {
//
//        char rightChar = str.charAt(str.length()-1 - i);
//        char leftChar = (char) (str.charAt(i));
//        // System.out.println(leftChar+" "+rightChar);
//
//        // char to number
//        int right = rightChar;
//        int left = leftChar;
//        // System.out.println(left+" "+right);
//
//        if (leftChar == rightChar) {
//        // do nothing
//        } else {
//        count+=(Math.abs(left-right));
//        }
//        }
//        System.out.println(count);
//        }


