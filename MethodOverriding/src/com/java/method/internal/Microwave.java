package com.java.method.internal;

public class Microwave extends Appliance {
    public Microwave() {
        System.out.println("microwave is heating food");
    }

    @Override
    public void operate() {
        System.out.println("microwave is running at medium power");
    }

    public void setTimer() {
        System.out.println("timer set for 2 minutes");
    }
}
