package com.prepbytes.Week1.selectionstatements;

import java.util.*;

public class SelectionStatementsBirthdayGift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt(); // first no
            int b = sc.nextInt(); // fav no
            int c = sc.nextInt(); // increment

            if (a == b){
                System.out.println("YES");
            }
            else if (a>b && c>0){
                System.out.println("NO");
            }
            else if (a<b && c<0){
                System.out.println("NO");
            }
            else if (c==0){
                System.out.println("NO");
            }
            else if (b>a && (b-a)%c==0){
                System.out.println("YES");
            }
            else if (b<a && (a-b)%c==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }
    }
}
