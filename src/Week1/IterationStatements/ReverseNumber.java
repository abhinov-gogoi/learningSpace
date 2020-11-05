package Week1.IterationStatements;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ReverseNumber {
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // given number
        int rem;
        int revNo = 0;
        while(X>0){
            rem = X%10;
            revNo = revNo*10 + rem;
            X = X/10;
        }
        System.out.println(revNo);

    }
}
