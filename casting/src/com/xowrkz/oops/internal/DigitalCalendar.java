package com.xowrkz.oops.internal;

public class DigitalCalendar extends Calendar {

    public DigitalCalendar() {
        System.out.println("no-arg constructor of DigitalCalendar");
    }

    @Override
    public void showDate() {
        System.out.println("Running showDate() in DigitalCalendar");
    }

    public void syncEvents() {
        System.out.println("Syncing digital calendar events...");
    }
}
