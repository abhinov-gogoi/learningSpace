package com.revise.OOPS;

 class Vehicle {
    private String name;
    private boolean doors;

    Vehicle(String name, boolean doors){
        this.name = name;
        this.doors = doors;
    }

    public void go(){
        System.out.printf("This vehicle is moving");
    }
    public void stop(){
        System.out.printf("This vehicle stopped");
    }

}
