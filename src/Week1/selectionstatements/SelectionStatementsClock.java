package Week1.selectionstatements;

import java.util.*;
import java.io.*;

public class SelectionStatementsClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int degree;
            if(h == 12 && m ==0)
                h = 0;
            else{
                h = (h * 30) + (m/2) ;
                m= m * 6;
            }
            degree = Math.abs(m-h);
            if (degree>180)
                System.out.println(360-degree);
            else System.out.println(degree);
        }
    }
}
