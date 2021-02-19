package com.geeksforgeeks.OOPConcepts.inheritance;

/*
https://www.geeksforgeeks.org/interfaces-in-java/

Like a class, an interface can have methods and variables,
but the methods declared in an interface are by default abstract (only method signature, no body).

*   Interfaces specify what a class must do and not how. It is the blueprint of the class.
*   An Interface is about capabilities, like a Player may be an interface
    and any class implementing Player must be able to (or must implement) move().
    So it specifies a set of methods that the class has to implement.
*   If a class implements an interface and does not provide method bodies for all functions specified in the interface,
    then the class must be declared abstract.

It is used to provide total abstraction.
That means all the methods in an interface
are declared with an empty body and are public
and all fields are public, static and final by default.
A class that implements an interface must implement all the methods declared in the interface.

To implement interface use implements keyword.

Q. Why do we use interface ?
A:  * It is used to achieve total abstraction.
    * Since java does not support multiple inheritance in case of class,
      but by using interface it can achieve multiple inheritance .
    * It is also used to achieve loose coupling.
    * Interfaces are used to implement abstraction.

Q. So the question arises why use interfaces when we have abstract classes?
A:  The reason is, abstract classes may contain non-final variables,
    whereas variables in interface are final, public and static.

*/


/*

interface <interface_name> {
    // declare constant fields as public static and final
    // declare methods that abstract by default.
}

*/

interface InterfaceInJava {
    final int height = 6;
    int move();
}
