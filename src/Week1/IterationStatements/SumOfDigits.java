package Week1.IterationStatements;

import java.util.Scanner;

public class SumOfDigits {
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // Enter the no
            int rem;
            int sum = 0;

            while(n>=10){
                rem = n%10;
                sum = sum + rem;
                n = n/10;
            }
            System.out.println(n+sum);
    }
}
