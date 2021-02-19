package com.brocode.customexceptions;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");

        try{
            // put dangerous code inside try block
            int age = scanner.nextInt();
            checkAge(age);
        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some problem occurred");
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age<18) {
            throw new AgeException("You must be 18+ to signup");
        }
        else
            System.out.println("You are now signed up");
    }
}
