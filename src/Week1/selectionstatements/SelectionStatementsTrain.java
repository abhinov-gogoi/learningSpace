package Week1.selectionstatements;

import java.util.*;
import java.io.*;

public class SelectionStatementsTrain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int seatNo = sc.nextInt(); // input N
            int berth = seatNo%8; // berth position SL/LB/MB/UB etc

            if(berth==0) {
                int P = seatNo - 8;
                System.out.println((P + 7) + "SL");
            }
            else if(berth==1)
                System.out.println((seatNo+3)+"LB");
            else if(berth==2)
                System.out.println((seatNo+3)+"MB");
            else if(berth==3)
                System.out.println((seatNo+3)+"UB");
            else if(berth==4)
                System.out.println((seatNo-3)+"LB");
            else if(berth==5)
                System.out.println((seatNo-3)+"MB");
            else if(berth==6)
                System.out.println((seatNo-3)+"UB");
            else if(berth==7)
                System.out.println((seatNo+1)+"SU");
        }
    }
}