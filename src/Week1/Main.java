package Week1;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int num = sc.nextInt();
            int sum=0;
            for(int i=0;i<num;i++){
                if(sum%10==0)
                    sum=sum+i;

            }
            t--;
            if(sum==num)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}