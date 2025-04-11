package com.java.method.internal;

public class SmartMirror extends Mirror {
    public SmartMirror() {
        System.out.println("Smart mirror is created");
    }

    @Override
    public void reflect() {
        System.out.println("Smart mirror reflects and displays information");
    }

    public void showWeather() {
        System.out.println("Smart mirror shows the current weather");
    }
}
