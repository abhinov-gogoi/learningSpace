package Week2;

import java.io.IOException;
import java.util.Scanner;

public class FindTheLeader {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int currentLeader = 0;
            for(int i=n-1; i >= 0; i--){
                if(arr[i]>arr[i+1] && arr[i]>=currentLeader){
                    System.out.print(arr[i]+" ");
                    currentLeader=arr[i];
                }
            }
            System.out.println();
        }
    }
}
