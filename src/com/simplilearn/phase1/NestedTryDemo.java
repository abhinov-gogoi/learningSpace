package com.simplilearn.phase1;

public class NestedTryDemo {
    public static void main(String[] args) {
        // outer try/catch block
        try{
            catchException();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught here "+e);
        }
        finally {
            System.out.println("finally outer block");
        }
    }

    public static void catchException() {
        int a=1;
        int b=0;
        try{
            System.out.println(a/b);
        }
        // Here in inner block, we don't have catch block,
        // so this method gives an exception
        // which is caught later by th catch block in outer block
        // Note that we don't require throw keyword
        finally {
            System.out.println("finally inner block");
        }
    }
}
