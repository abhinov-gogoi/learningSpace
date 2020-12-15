package week5;

import java.util.Scanner;

public class MissingInAPLinearSearch {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            long[] arr = new long[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextLong();
            }

            long a = arr[1]-arr[0];
            long b = arr[2]-arr[1];
            long increment = Math.min(a,b);

            for(int i=1; i<N; i++){
                if(arr[i]-increment != arr[i-1]){
                    System.out.println(arr[i-1]+increment);
                    i=N; // break
                }
            }
        }
    }
}
