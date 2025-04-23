package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartDesk;

public class SmartDeskImpl implements SmartDesk {
    public void adjustHeight(int height) {
        System.out.println("SmartDesk: Height adjusted to " + height + " cm.");
    }
    public void lockHeight() {
        System.out.println("SmartDesk: Height locked.");
    }
    public void enableReminder() {
        System.out.println("SmartDesk: Reminder enabled.");
    }
    public void disableReminder() {
        System.out.println("SmartDesk: Reminder disabled.");
    }
    public void showUsageStats() {
        System.out.println("SmartDesk: Usage today is 3 hours.");
    }
}
