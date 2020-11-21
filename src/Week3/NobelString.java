package Week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NobelString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            str = str.toLowerCase();
            boolean isNobel = true;

            int[] arr = new int[str.length()];
            for (int i=0; i<str.length(); i++) {
                final boolean consonant =
                        str.charAt(i) != 'a' &&
                        str.charAt(i) != 'e' &&
                        str.charAt(i) != 'i' &&
                        str.charAt(i) != 'o' &&
                        str.charAt(i) != 'u';

                if(str.charAt(i)=='n'){
                    // do nothing
                }
                else if(i==str.length()-1){
                    // check first if control is at last index otherwise out of bounds exception for i+1
                    if(consonant){
                        isNobel = false;
                    }
                }
                else if(consonant){
                    // if i is consonant check if i+1 is consonant
                    if(str.charAt(i+1)!='a' &&
                       str.charAt(i+1)!='e' &&
                       str.charAt(i+1)!='i' &&
                       str.charAt(i+1)!='o' &&
                       str.charAt(i+1)!='u'){
                        // if i+1 is also consonant its not Nobel
                        isNobel = false;
                    }
                }
            }

            if(isNobel){
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }
    }
}
