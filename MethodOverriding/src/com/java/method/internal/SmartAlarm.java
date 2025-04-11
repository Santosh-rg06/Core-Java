package com.java.method.internal;

public class SmartAlarm extends Alarm {
    public SmartAlarm() {
        System.out.println("Smart alarm activated");
    }

    @Override
    public void ring() {
        System.out.println("Smart alarm ringing with custom tone");
    }

    public void snooze() {
        System.out.println("Smart alarm snoozed for 5 minutes");
    }
}
