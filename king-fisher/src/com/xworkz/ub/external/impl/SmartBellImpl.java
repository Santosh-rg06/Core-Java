package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartBell;

public class SmartBellImpl implements SmartBell {
    public void ringBell() {
        System.out.println("SmartBell: Bell rang.");
    }
    public void setSchedule(String time) {
        System.out.println("SmartBell: Bell schedule set at " + time + ".");
    }
    public void muteBell() {
        System.out.println("SmartBell: Bell muted.");
    }
}
