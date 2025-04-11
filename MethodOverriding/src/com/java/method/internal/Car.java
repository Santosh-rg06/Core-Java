package com.java.method.internal;

public class Car extends Vehicle {
    public Car(){
        System.out.println("running inside the Car CONST");
    }
    @Override
    public void move(){
        System.out.println("running inside subclass the move");
    }
    public void speed(){
        System.out.println("running inside the speed");
    }
}
