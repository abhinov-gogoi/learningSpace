package com.brocode.customexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter a whole number to divide 100 : ");
            int dividing_number = sc.nextInt();

            int result = 100/dividing_number;
            System.out.println("100 divided by "+dividing_number+" is "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("You cant divide by ZERO "+e);
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a number Only "+e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("finally block will always execute");
            sc.close();
        }







    }
}
