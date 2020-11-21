package Week2;

import java.io.IOException;
import java.util.Scanner;

public class QualityFactor3 {
    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] prepBuddyArr = new int[n];
            for (int i = 0; i < n; i++) {
                prepBuddyArr[i] = sc.nextInt();
            }

            int[] rahulArr = new int[n];
            long total = 0L;

            for(int current = 0; current<n; current++){
                if(rahulArr[current]==prepBuddyArr[current]){
                    // do nothing move to next element
                }
                else{
                    total = total+(Math.abs(rahulArr[current]-prepBuddyArr[current]));
                        rahulArr[current] = prepBuddyArr[current];
                        if(current<n-1)
                            rahulArr[current+1] = rahulArr[current];
                }
            }
            System.out.println(total);
    }
}
