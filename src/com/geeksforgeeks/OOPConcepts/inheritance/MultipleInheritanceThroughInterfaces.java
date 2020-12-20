package com.geeksforgeeks.OOPConcepts.inheritance;

/*
https://www.geeksforgeeks.org/inheritance-in-java/
https://www.geeksforgeeks.org/java-and-multiple-inheritance/

Java does not support multiple inheritance with classes.
In java, we can achieve multiple inheritance only through Interfaces.

Why Java does not support Multiple Inheritance?

A: Problem occurs when there exist methods with same signature
in both the super classes and subclass. On calling the method,
the compiler cannot determine which class method to be called
and even on calling which class method gets the priority.
Multiple inheritance causes "diamond problem" when allowed in other languages like C++.


*/

interface InterfaceOne
{
    // default method
    default void show()
    {
        System.out.println("Default InterfaceOne");
    }
}

interface InterfaceTwo
{
    // Default method
    default void show()
    {
        System.out.println("Default InterfaceTwo");
    }
}

// Implementation class code
class TestClass implements InterfaceOne, InterfaceTwo
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of InterfaceOne interface
        InterfaceOne.super.show();

        // use super keyword to call the show
        // method of InterfaceTwo interface
        InterfaceTwo.super.show();
    }
}

public class MultipleInheritanceThroughInterfaces{
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}
