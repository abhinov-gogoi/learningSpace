package week4;

import java.io.IOException;
import java.util.Scanner;

public class Pattern {

    public static int printPattern(int number){
        if(number>0)
            return number + printPattern(number-1);
        else
            return number;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int number = sc.nextInt();
            int sum = printPattern(number);
            System.out.println(sum);
        }
    }
}
