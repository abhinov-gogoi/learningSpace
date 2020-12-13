package week5;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccourences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char[] arr = new char[n];
            for(int i=0; i<arr.length; i++){
                arr[i]= sc.next().charAt(0);
            }
//            System.out.println(Arrays.toString(arr));
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]=='x')
                    count++;
            }
            System.out.println(count);

        }
    }
}
