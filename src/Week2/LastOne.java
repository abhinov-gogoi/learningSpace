package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LastOne {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            boolean containsOne = false;
            int lastIndexOfOne = 0;

            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
                if(arr[i]==1){
                    containsOne = true;
                    lastIndexOfOne = i;
                }
            }

            if(containsOne){
                System.out.println(lastIndexOfOne);
            }
            else
                System.out.println(-1);
        }
    }
}
