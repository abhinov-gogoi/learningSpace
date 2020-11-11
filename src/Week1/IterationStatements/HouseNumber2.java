package Week1.IterationStatements;

import java.util.*;
import java.io.*;

public class HouseNumber2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long N = sc.nextInt();
            long M = N;
            long totalDigits = 0L;
            long digitsInInput = 0;
            while (N != 0) {
                N = N / 10;
                digitsInInput++;
            }
            if(digitsInInput==0){
                System.out.println(totalDigits);
            }
            else if(digitsInInput==1){
                System.out.println(totalDigits+1);
            }else if(digitsInInput==2){
                totalDigits = 9*1 + (M-10+1)*2;
                System.out.println(totalDigits);
            }else if(digitsInInput==3){
                totalDigits = 9*1 + 90*2 + (M-100+1)*3;
                System.out.println(totalDigits);
            }else if(digitsInInput==4){
                totalDigits = 9*1 + 90*2 + 900*3 +(M-1000+1)*4;
                System.out.println(totalDigits);
            }
            else if(digitsInInput==5){
                totalDigits = 9*1 + 90*2 + 900*3 + 9000*4 + (M-10000+1)*5;
                System.out.println(totalDigits);
            }else if(digitsInInput==6){
                totalDigits = 9*1 + 90*2 + 900*3 + 9000*4 + 90000*5 + (M-100000+1)*6;
                System.out.println(totalDigits);
            }
            else if(digitsInInput==7){
                totalDigits = 9*1 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + (M-1000000+1)*7;
                System.out.println(totalDigits);
            }
            else if(digitsInInput==8){
                totalDigits = 9*1 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + (M-10000000+1)*8;
                System.out.println(totalDigits);
            }
            else if(digitsInInput==9){
                totalDigits = 9*1 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + 90000000*8 + (M-100000000+1)*9;
                System.out.println(totalDigits);
            }
            else if(digitsInInput==10){
                totalDigits = (long)(9*1 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + 90000000*8 + 900000000L*9 + (M-100000000+1)*10);
                System.out.println(totalDigits);
            }else
                System.out.println("undefined");
        }

    }
}
