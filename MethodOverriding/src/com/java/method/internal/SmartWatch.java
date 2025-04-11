package com.java.method.internal;

public class SmartWatch extends WearableDevice {
    public SmartWatch() {
        System.out.println("SmartWatch activated");
    }

    @Override
    public void showFeatures() {
        System.out.println("SmartWatch: Step count, Heart rate, Notifications");
    }

    public void trackSleep() {
        System.out.println("Tracking user's sleep cycle");
    }
}
