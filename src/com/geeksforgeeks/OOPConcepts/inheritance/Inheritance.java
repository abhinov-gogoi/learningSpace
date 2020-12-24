package com.geeksforgeeks.OOPConcepts.inheritance;

// https://www.geeksforgeeks.org/inheritance-in-java/


// base class
class Bicycle{
    // Bicycle class has two fields
    int speed;
    int gear;

    // the Bicycle class has one Constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    // Bicycle class has three methods
    void speedUp(int speedInc){
        speed = speed + speedInc;
    }

    void applyBreaks(int speedDec){
        speed = speed - speedDec;
    }

    // toString() method to print info of Bicycle
    public String toString(){
        return("No of gears is "+gear+ "\n"+ "Speed of Bicycle is "+speed);
    }
}

// derived class
class MountainBike extends Bicycle{

    // the MountainBike SubClass adds one more field
    int seatHeight;

    // the MountainBike SubClass has one constructor
    public MountainBike(int gear, int speed, int seatHeight){

        // invoking baseclass(Bicycle) constructor in the 1st statement of subclass's constructor
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    //  the MountainBike SubClass adds one more method
    void adjustSeatHeight(int height){
        seatHeight = height;
    }

    // overriding toString() method of parent Bicycle class to print more info
    public String toString(){
        return (super.toString()+"\n"+"Height of MountainBike is "+ seatHeight);
    }
}

// DriverClass to test
public class Inheritance {
    public static void main(String[] args){
        MountainBike abhinovsBike = new MountainBike(7,80,4);
        String result = abhinovsBike.toString();
        System.out.println(result);
    }
}

/*
A subclass inherits all the members (fields, methods, and nested classes)
from its superclass. Constructors are not members,
so they are not inherited by subclasses,
but the constructor of the superclass can be invoked from the subclass.
 */

