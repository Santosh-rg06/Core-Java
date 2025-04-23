package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartBlinds;

public class SmartBlindsImpl implements SmartBlinds {

    @Override
    public void open() {
        System.out.println("SmartBlinds: Opened.");
    }

    @Override
    public void close() {
        System.out.println("SmartBlinds: Closed.");
    }

    @Override
    public void setAngle(int angle) {
        System.out.println("SmartBlinds: Angle set to " + angle + " degrees.");
    }

    @Override
    public void scheduleOpen(String time) {
        System.out.println("SmartBlinds: Will open at " + time + ".");
    }

    @Override
    public void scheduleClose(String time) {
        System.out.println("SmartBlinds: Will close at " + time + ".");
    }
}
