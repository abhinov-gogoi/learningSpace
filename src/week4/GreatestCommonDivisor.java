package week4;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void commonDivisor(int biggernum, int smallernum){
        if(biggernum%smallernum==0)
            System.out.println(smallernum);
        else
            commonDivisor(smallernum, biggernum%smallernum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N>M)
                commonDivisor(N, M); // N > M
            else
                commonDivisor(M, N); // M > N
        }
    }
}
