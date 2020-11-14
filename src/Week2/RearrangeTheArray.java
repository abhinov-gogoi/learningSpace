package Week2;

import java.io.IOException;
import java.util.Scanner;

public class RearrangeTheArray {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
