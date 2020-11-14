package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GreaterThanNeighbour {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean noSuchHouse = true;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            if(arr[0]>arr[1]){
                System.out.print(0+" ");
                noSuchHouse = false;
            }
            for(int i=1; i<=n-2; i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.print(i+" ");
                    noSuchHouse = false;
                }
            }
            if(arr[n-1]>arr[n-2]){
                System.out.print(n-1);
                noSuchHouse = false;
            }
            if(noSuchHouse){
                System.out.println(-1);
            }
            System.out.println();
        }
    }
}
