package week5;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityVotes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i< arr.length; i++){
                arr[i]= scan.nextInt();
            }
            System.out.println(majorityVotes(arr, n));
        }
    }

    static int majorityVotes(int[] arr, int n){
        int[] countArr = new int[n];
        // populate the freq arr
        for(int i=0; i<n; i++){
            countArr[arr[i]]++;
        }

        int max=countArr[0], index = 0;
        for(int i=1; i<countArr.length; i++){
            if(countArr[i]>countArr[i-1]){
                max=countArr[i];
                index=i;
            }
        }

        if(max>n/2)
            return index;
        else
            return -1;
    }
}
