package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class InterestingArrayOptimised {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            boolean noSuchPairExist = true;
            int leftIndex = 0;
            int left = arr[leftIndex];
            int rightIndex = n-1;
            int right = arr[rightIndex];

            boolean inLoop = true;
            while(inLoop){
                int sum = left+right;
                if(left == right) {
                    inLoop = false;
                }
                else if(sum==k) {
                    noSuchPairExist = false;
                    inLoop = false;
                }
                else if(sum<k) {
                    leftIndex++;
                    left = arr[leftIndex];
                }
                else {
                    rightIndex--;
                    right = arr[rightIndex];
                }
            }
            if(noSuchPairExist)
                System.out.println("no answer");
            else
                System.out.println(leftIndex+" "+rightIndex);
        }
    }
}
