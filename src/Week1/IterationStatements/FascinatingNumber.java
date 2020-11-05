package Week1.IterationStatements;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class FascinatingNumber {
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();

                int nextNumber = N + 1;
                int firstDigitOfNextNumber, secondDigitOfNextNumber, thirdDigitOfNextNumber, fourthDigitOfNextNumber;
                boolean inLoop = true;
                while(inLoop){
                    fourthDigitOfNextNumber=(nextNumber)%10;
                    thirdDigitOfNextNumber=(nextNumber/10)%10;
                    secondDigitOfNextNumber=(nextNumber/100)%10;
                    firstDigitOfNextNumber=(nextNumber/1000)%10;

                    if(fourthDigitOfNextNumber != thirdDigitOfNextNumber
                            && fourthDigitOfNextNumber != secondDigitOfNextNumber
                            && fourthDigitOfNextNumber != firstDigitOfNextNumber
                            && thirdDigitOfNextNumber != secondDigitOfNextNumber
                            && thirdDigitOfNextNumber != firstDigitOfNextNumber
                            && secondDigitOfNextNumber != firstDigitOfNextNumber){
                        System.out.println(nextNumber);
                        inLoop = false;
                    }else
                        nextNumber=nextNumber+1;
                }

        }


    }
}