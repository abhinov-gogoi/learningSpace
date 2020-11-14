package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissing {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n-1]; // Array with the missing number
            int sumOfArr = 0; // sum of all elements in arr
            for(int i=0; i<(n-1); i++){
                arr[i] = sc.nextInt();
                sumOfArr = sumOfArr + arr[i];
            }

            int[] arrAll = new int[n]; // Array with All the numbers
            int sumOfArrAll = 0; // sum of all elements in arrAll
            for(int i=0; i<n; i++){
                arrAll[i] = i+1;
                sumOfArrAll = sumOfArrAll + arrAll[i];
            }

            // System.out.println(Arrays.toString(arrAll));
            // System.out.println(Arrays.toString(arr));

            // find diff of two sums
            System.out.println(sumOfArrAll-sumOfArr);
        }
    }
}




//    boolean numberIsAtLastIndex = true;
//            for(int i=0; i<n-1; i++){
//        if(arrAll[i]!=arr[i]){
//        int missingNo = arrAll[i];
//        System.out.println(missingNo);
//        numberIsAtLastIndex = false;
//        i = n; // break out of loop
//        }
//        }
//        if(numberIsAtLastIndex){
//        System.out.println(arrAll[n-1]); // print the last no in arrAll
//        }