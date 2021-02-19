package com.hackerrank.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//www.hackerrank.com/challenges/java-static-initializer-block/problem
public class StaticInitialisationBlocks {

    static int H;
    static int B;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        try{
            H = sc.nextInt();
            B = sc.nextInt();
            if(H<=0 || B<=0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag =false;
            }
        }
        catch(Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
