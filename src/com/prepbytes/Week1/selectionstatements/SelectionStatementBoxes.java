package com.prepbytes.Week1.selectionstatements;

import java.util.Scanner;

public class SelectionStatementBoxes {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count = 0;
    int N = sc.nextInt(); // no of boxes
        while(N-->0){
            int t = sc.nextInt(); // no of toys present
            int c = sc.nextInt(); // max capacity
            if(c-t>=2)
                count++;
        }
        System.out.println(count);
    }
}
