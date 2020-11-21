package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeTheArray {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n]; // input array in ascending order
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int[] arrangedArr = new int[n];

            int descendingIndex = 0; // starting index of largest number
            for(int i=n-1; i>=n/2; i--){
                arrangedArr[descendingIndex] = arr[i];
                descendingIndex +=2 ;
            }
            int ascendingIndex = -1; // starting index of smallest number
            for(int i=0; i<n/2; i++) {
                ascendingIndex += 2;
                arrangedArr[ascendingIndex] = arr[i];
            }
            String formattedString = Arrays.toString(arrangedArr)
            .replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "")  //remove the left bracket
            .trim();           //remove trailing spaces from partially initialized arrays
            System.out.println(formattedString);
        }
    }
}
































//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//        while(t-->0){
//                int n = sc.nextInt();
//
//                int[] arr = new int[n]; // input array in ascending order
//                for(int i=0; i<arr.length; i++){
//        arr[i] = sc.nextInt();
//        }
//        int[] arrangedArr = new int[n];
//
//        if(n%2==0){
//        // if input array is even
//        int descendingIndex = 0; // starting index of largest number
//        for(int i=n-1; i>=n/2; i--){
//        arrangedArr[descendingIndex] = arr[i];
//        descendingIndex +=2 ;
//        }
//        int ascendingIndex = -1; // starting index of smallest number
//        for(int i=0; i<n/2; i++){
//        ascendingIndex+=2;
//        arrangedArr[ascendingIndex]=arr[i];
//        }
//        }
//        else{
//        // if input array is odd
//        int descendingIndex = 0; // starting index of largest number
//        for(int i=n-1; i>=n/2; i--){
//        arrangedArr[descendingIndex] = arr[i];
//        descendingIndex +=2 ;
//        }
//        int ascendingIndex = -1; // starting index of smallest number
//        for(int i=0; i<n/2; i++){
//        ascendingIndex+=2;
//        arrangedArr[ascendingIndex]=arr[i];
//        }
//        }
//
//        System.out.println(Arrays.toString(arrangedArr));
//        }
