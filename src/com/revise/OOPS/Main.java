package com.revise.OOPS;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(" BMW", true);
        Bike myBike = new Bike(" Yamaha", false);

        System.out.println(myVehicle);
        myVehicle.go();

        System.out.println(myBike);
        myBike.go();

        myBike.go();
    }
}
