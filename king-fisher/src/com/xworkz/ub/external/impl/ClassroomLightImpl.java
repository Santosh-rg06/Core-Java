package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.ClassroomLight;

public class ClassroomLightImpl implements ClassroomLight {
    public void turnOn() {
        System.out.println("ClassroomLight: Light turned ON.");
    }
    public void turnOff() {
        System.out.println("ClassroomLight: Light turned OFF.");
    }
    public void adjustBrightness(int level) {
        System.out.println("ClassroomLight: Brightness adjusted to " + level + "%.");
    }
}
