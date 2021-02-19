package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class QualityFactor2 {
    public static void main(String[] args) throws IOException {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int[] prepBuddyArr = new int[n];
                for (int i = 0; i < n; i++) {
                    prepBuddyArr[i] = sc.nextInt();
                }

                int[] rahulArr = new int[n];
                int currentIndexInCheck = 0;
                boolean inLoop = true;
                int count = 0;

                while(inLoop){
                    if(currentIndexInCheck==n){
                        // break loop when last index is reached
                        inLoop = false;
                    }
                    else if(rahulArr[currentIndexInCheck]==prepBuddyArr[currentIndexInCheck]){
                        // if nos of both arrays in current index is equal, move to next index
                        currentIndexInCheck++;
                    }
                    else if(rahulArr[currentIndexInCheck]<prepBuddyArr[currentIndexInCheck]){
                        // if rahul array is lesser, add a red stone (+1) to all elements from current index
                        for(int i=currentIndexInCheck; i<n; i++){
                            rahulArr[i] += 1;
                        }
                        count++;
                    }
                    else if(rahulArr[currentIndexInCheck]>prepBuddyArr[currentIndexInCheck]){
                        // if rahul array is greater, add a black stone (-1) to all elements from current index
                        for(int i=currentIndexInCheck; i<n; i++){
                            rahulArr[i] -= 1;
                        }
                        count++;
                    }

                }
                System.out.println(count);

    }
}










//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//        while(t-->0){
//                int n = sc.nextInt();
//                int[] prepBuddyArr = new int[n];
//                for(int i=0; i<n; i++){
//        prepBuddyArr[i] = sc.nextInt();
//        }
//
//        int[] rahulArr = new int[n];
//        boolean inLoop = true;
//        int currentIndexInCheck = 0;
//        int count = 0;
//        while(inLoop){
//        if(currentIndexInCheck==n-1){
//        inLoop = false;
//        }
//
//        if(prepBuddyArr[currentIndexInCheck]==rahulArr[currentIndexInCheck]){
//        currentIndexInCheck++;
//        }
//        else if(prepBuddyArr[currentIndexInCheck]>rahulArr[currentIndexInCheck]){
//        // AddARedStone
//        int currentIndexInc = 0;
//        currentIndexInc = currentIndexInCheck;
//        for(int i=currentIndexInCheck; i<n; i++){
//        rahulArr[currentIndexInc] += 1;
//        currentIndexInc++;
//        }
//        count++;
//        currentIndexInCheck++;
//        }
//        else if(prepBuddyArr[currentIndexInCheck]<rahulArr[currentIndexInCheck]){
//        // AddABlackStone
//        int currentIndexInc = 0;
//        currentIndexInc = currentIndexInCheck;
//        for(int i=currentIndexInCheck; i<n; i++){
//        rahulArr[currentIndexInc] -= 1;
//        currentIndexInc++;
//        }
//        count++;
//        currentIndexInCheck++;
//        }
//        }
//        System.out.println(count);