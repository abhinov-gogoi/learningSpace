package Week2;

import java.io.IOException;
import java.util.Scanner;

public class FriendsAges {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int friendreqsent = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[j]<=(0.5*arr[i]+7) || (arr[j]>100*arr[i] && arr[j]<100) || arr[j]>arr[i]){
                        // dont send friend req
                    }else
                        friendreqsent++;

                }
            }
            System.out.println(friendreqsent);
        }
    }
}
