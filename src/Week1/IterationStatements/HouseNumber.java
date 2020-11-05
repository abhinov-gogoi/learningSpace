package Week1.IterationStatements;

import java.util.*;
        import java.io.*;

public class HouseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int noOfDigits = 0;
            while(N>0){
                boolean quotientIsNotZero = true;
                while (quotientIsNotZero){
                    noOfDigits = noOfDigits + 1;
                    N = N/10;
                    if(N==0){
                        quotientIsNotZero = false;
                    }
                }
            N--;
            }
        }


    }
}