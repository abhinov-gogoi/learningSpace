package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k>=n){
                k=k%n;
            }

            int[] arr = new int[n];
            int[] rotatedArr = new int[n];
            // take input for the array
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            // put the k elements into new array
            for(int i=0; i<k; i++){
                rotatedArr[i] = arr[n-k+i];
                System.out.print(rotatedArr[i]+" ");
            }
            // put rest elements into new array
            int count = 0;
            for(int i=k; i<n; i++){
                rotatedArr[i] = arr[count];
                System.out.print(rotatedArr[i]+" ");
                count++;
            }
            System.out.println();
        }

    }
}














//TLE ERROR all tough correct

//Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//
//        while(t-->0){
//                int n = sc.nextInt();
//                int k = sc.nextInt();
//                int[] arr = new int[n];
//                int[] rotatedArr = new int[n];
//
//                // take input for the array
//                for(int i=0; i<n; i++){
//        arr[i] = sc.nextInt();
//        }
//
//        while(k-->0){
//        // put last element of arr into new first element rotatedArr
//        rotatedArr[0] = arr[n-1];
//
//        // put rest elements into rotatedArr
//        for(int i=1; i<n; i++){
//        rotatedArr[i] = arr[i-1];
//        }
//
//        // copy elements of rotatedArr into arr
//        for(int i=0; i<n; i++){
//        arr[i]=rotatedArr[i];
//        }
//        }
//        String formattedString = Arrays.toString(rotatedArr)
//        .replace(",", "")  //remove the commas
//        .replace("[", "")  //remove the right bracket
//        .replace("]", "")  //remove the left bracket
//        .trim();           //remove trailing spaces from partially initialized arrays
//
//        System.out.println(formattedString);
//        }