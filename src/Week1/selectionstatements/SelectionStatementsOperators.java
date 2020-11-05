package Week1.selectionstatements;

import java.util.*;
import java.io.*;

public class SelectionStatementsOperators {
    public static void main (){
         Scanner sc = new Scanner(System.in);
         int x, y;
         x=sc.nextInt();
         y=sc.nextInt();
         if(x>y)
             System.out.println(x+" is greater than "+y);
         else if(x<y)
             System.out.println(x+" is smaller than "+y);
         else System.out.println(x+" is equal to "+y);
    }
}
