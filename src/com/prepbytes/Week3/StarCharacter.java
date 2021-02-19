package com.prepbytes.Week3;

import java.io.IOException;
import java.util.Scanner;

public class StarCharacter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int N = sc.nextInt();
            String starCharString = "";

            String[] arr = new String[N]; // Array to store N number of Strings
            for(int i=0; i<N; i++){
                arr[i] = sc.next();
            }
//            System.out.println(Arrays.toString(arr));

            String str = arr[0]; // 1st string in the arr
            for(int i=0; i<str.length(); i++){
                boolean isStarCharacter = true;
                char charInCheck = str.charAt(i);
                String elemInCheck = charInCheck+""; // convert char to string
                for(int j=1; j< arr.length; j++){
                    if(!arr[j].contains(elemInCheck)){
                        // if elem is not found skip to next i
                        isStarCharacter = false;
                        j = arr.length;
                    }
                }

                if(isStarCharacter){
                    if(!starCharString.contains(str.charAt(i)+"")){
                        starCharString += str.charAt(i)+"";
//                        System.out.println(str.charAt(i)+" is Star Character");
                    }
                }
            }
            System.out.println(starCharString.length());
        }
    }
}

