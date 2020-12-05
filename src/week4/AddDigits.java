package week4;

import java.io.IOException;
import java.util.Scanner;

public class AddDigits {

    public static void addNumbers(int n, int sum){
        int digit = n%10;
        sum+= digit;
        if(n==0){
            System.out.println(sum);
            return;
        }
        addNumbers(n/10, sum);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum = 0;
            addNumbers(n, sum);
        }
    }
}
