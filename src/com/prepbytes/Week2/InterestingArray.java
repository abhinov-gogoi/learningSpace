package com.prepbytes.Week2;

import java.io.IOException;
import java.util.Scanner;

public class InterestingArray {
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

            int firstIndexInPair = 0;
            int secondIndexInPair = 0;
            boolean noSuchPairExist = true;

            for(int i=0; i<n-1; i++){
                for(int j=1; j<n; j++){
                    if(arr[i]+arr[j]==k && i!=j && firstIndexInPair<=i && secondIndexInPair<=j){
                        noSuchPairExist = false;
                        firstIndexInPair = i;
                        secondIndexInPair = j;
                    }
                }
            }

            if(noSuchPairExist)
                System.out.println("no answer");
            else
                System.out.println(firstIndexInPair+" "+secondIndexInPair);
        }
}
}
