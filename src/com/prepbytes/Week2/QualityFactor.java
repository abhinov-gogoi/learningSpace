package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QualityFactor {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int[] prepBuddyArr = new int[n];
            for(int i=0; i<n; i++){
                prepBuddyArr[i] = sc.nextInt();
            }
            int[] rahulArr = new int[n];
            int noOfOperations = 0;
            for(int i=0; i<n; i++){
                if(prepBuddyArr[i]==rahulArr[i]){
                    // skip to next index of prepBuddyArr
                    System.out.println(Arrays.toString(rahulArr));
                }else{
                    if(prepBuddyArr[i]>rahulArr[i]){
                        // increment each elem of rahulArr by 1
                            for(int j=i; j<n; j++){
                                rahulArr[j]+=rahulArr[i]+1;
                            }
                    }else{
                        // decrement each elem of rahulArr by 1
                            for(int j=i; j<n; j++){
                                rahulArr[j]+=rahulArr[i]-1;
                            }
                    }
                    System.out.println(Arrays.toString(rahulArr));
                    noOfOperations++;
                }
            }
            System.out.println(noOfOperations);

        }
    }
}
