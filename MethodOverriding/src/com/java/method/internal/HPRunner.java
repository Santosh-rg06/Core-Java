package com.java.method.internal;

public class HPRunner {
    public static void main(String[] args) {
        HP hpDevice = new HP();
        hpDevice.deviceInfo();

        HP gameDevice = new GamingLaptop();
        gameDevice.deviceInfo();

        GamingLaptop gamer = new GamingLaptop();
        gamer.deviceInfo();
        gamer.launchGame();
    }
}
