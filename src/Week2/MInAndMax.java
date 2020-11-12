package Week2;

import java.io.IOException;
import java.util.Scanner;

public class MInAndMax {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<arr.length; i++){
                int element = sc.nextInt();
                arr[i] = element;
            }
            int min = arr[0];
            int max = arr[0];

            for (int j : arr) {
                if (j <= min) {
                    min = j;
                }
            }
            for (int j : arr) {
                if (j >= max) {
                    max = j;
                }
            }
            System.out.println(min+" "+max);
        }
    }
}
