package Week1.selectionstatements;
import java.util.*;
import java.io.*;

public class SelectionStatementsSecSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>b && a<c)
                System.out.println(a);
            else if(b>a && b<c)
                System.out.println(b);
            else if(c>a && c<b)
                System.out.println(c);
            else if(a>b && b>c)
                System.out.println(b);
            else if(a<b && b>c)
                System.out.println(a);
            else if(a>b && b<c)
                System.out.println(c);

    }
}


