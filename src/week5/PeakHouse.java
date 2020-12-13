package week5;

import java.util.Scanner;

public class PeakHouse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int N = scan.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<arr.length; i++){
                arr[i]= scan.nextInt();
            }
            if(arr[0]>arr[1])
                System.out.print(0+" ");
            if(arr[N-1]>arr[N-2])
                System.out.print(N-1+" ");
            for(int i=1; i<N-1; i++){
                if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
                    System.out.print(i+" ");
            }
        }
    }
}
