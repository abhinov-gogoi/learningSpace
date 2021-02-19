package com.prepbytes.Week1.selectionstatements;

import java.util.*;

public class SelectionStatementOpValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a;
        a = sc.next().charAt(0);

        // using SWITCH
//        switch(a){
//            case 'P':
//            case 'p':
//                System.out.println("Prepbytes");
//                break;
//            case 'Z':
//            case 'z':
//                System.out.println("Zenith");
//                break;
//            case 'E':
//            case 'e':
//                System.out.println("Expert Coder");
//                break;
//            case 'D':
//            case 'd':
//                System.out.println("Data Structure");
//                break;
//            default:
//                System.out.println("Undefined");

        // Using IF ELSE IF
        if (a == 'P')
            System.out.println("Prepbytes");
        else if (a == 'p')
            System.out.println("Prepbytes");
        else if (a == 'Z')
            System.out.println("Zenith");
        else if (a == 'z')
            System.out.println("Zenith");
        else if (a == 'E')
            System.out.println("Expert Coder");
        else if (a == 'e')
            System.out.println("Expert Coder");
        else if (a == 'D')
            System.out.println("Data Structure");
        else if (a == 'd')
            System.out.println("Data Structure");

        }

}

