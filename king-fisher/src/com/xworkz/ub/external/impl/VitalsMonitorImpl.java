package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.VitalsMonitor;

public class VitalsMonitorImpl implements VitalsMonitor {
    public void checkVitals() {
        System.out.println("VitalsMonitor: Patient vitals checked.");
    }
}
