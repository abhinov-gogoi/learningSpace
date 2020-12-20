package com.prepbytes.Week1.selectionstatements;

import java.util.*;

public class TenFromTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if (n%5==0){
                int count = 0;
                while(n%10 !=0){
                    count++;
                    n = n*2;
                }
                System.out.println(count);
            }else System.out.println(-1);
        }

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            if (n>= 1 && n<50){
//                int count = 0;
//                while(n%10 !=0){
//                    count++;
//                    n = n*2;
//                }
//                System.out.println(count);
//            }else System.out.println(-1);
//        }

    }
}