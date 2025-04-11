package com.java.method.internal;

public class InsulatedLunchBox extends LunchBox {
    public InsulatedLunchBox() {
        System.out.println("Insulated lunch box created");
    }

    @Override
    public void packFood() {
        System.out.println("Packing food in an insulated lunch box to keep it warm");
    }

    public void maintainTemperature() {
        System.out.println("Lunch box keeps food warm for 6 hours");
    }
}
