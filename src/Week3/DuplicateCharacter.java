package Week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            int[] freq = new int[26];

            // loop through input string
            for(int i=0; i<str.length(); i++)
                freq[str.charAt(i)-97]++; // increment freq array's index of that particular char(i)

            boolean noSuchChar = true;
            // loop through freq array
            for(int i=0; i< freq.length; i++){
                if(freq[i]>1){
                    noSuchChar = false;
                    char c = (char)(97+i);
                    System.out.print(c+"="+freq[i]+" ");
                }
            }
            if(noSuchChar)
                System.out.println(-1);
            else
                System.out.println();
        }
    }
}

