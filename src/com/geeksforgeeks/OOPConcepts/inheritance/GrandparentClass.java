package com.geeksforgeeks.OOPConcepts.inheritance;
// https://www.geeksforgeeks.org/accessing-grandparents-member-in-java-using-super/

// In Java, a class cannot directly access the grandparent’s members.
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        // Trying to access Grandparent's Print(). SHOWS ERROR
        // super.super.Print();
        System.out.println("Child's Print()");
    }
}

// DriverClass
public class GrandparentClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}


/*There is error in line “super.super.print();”.
 In Java, a class cannot directly access the grandparent’s members.

 It is allowed in C++ though.
 In C++, we can use scope resolution operator (::) to access any ancestor’s member in inheritance hierarchy.

 In Java, we can access grandparent’s members only through the parent class.*/


