package com.java.method.internal;

public class LEDBulbRunner {
    public static void main(String[] args) {
        Bulb b = new Bulb();
        b.lightUp();

        Bulb led = new LED();
        led.lightUp();

        LED light = new LED();
        light.lightUp();
        light.saveEnergy();
    }
}
