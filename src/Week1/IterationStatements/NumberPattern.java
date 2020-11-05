package Week1.IterationStatements;
import java.util.*;
import java.io.*;

public class NumberPattern {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int j;

        for (i=5; i>=1; i-- ){
            for (j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
