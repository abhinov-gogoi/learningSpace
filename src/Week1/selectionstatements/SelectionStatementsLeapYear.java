package Week1.selectionstatements;//import java.util.*;
//import java.io.*;
//
//public class Week1.selectionstatements.SelectionStatementsLeapYear {
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        int t;
//        t = sc.nextInt();
//        while(t-->0){
//            int a;
//            a = sc.nextInt();
//            if (a%4==0){
//                if (a%100==0) {
//                    if (a%400==0)
//                        System.out.println("Yes");
//                    System.out.println("No");
//                    continue;
//                }
//                System.out.println("Yes");
//            }else
//                System.out.println("No");
//        }
//    }
//
//}

import java.util.*;
import java.io.*;
public class SelectionStatementsLeapYear {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int year = sc.nextInt();
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
