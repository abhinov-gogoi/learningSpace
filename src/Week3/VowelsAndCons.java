package Week3;

import java.io.IOException;
import java.util.Scanner;

public class VowelsAndCons {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
              String str = sc.next();
              str = str.toUpperCase();
              int vowels = 0;
              int consonants = 0;
              for (int i=0; i<str.length(); i++){
                  if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                    vowels++;
                  }
                  else
                      consonants++;
              }
            System.out.println(vowels+" "+consonants);
        }
    }
}
