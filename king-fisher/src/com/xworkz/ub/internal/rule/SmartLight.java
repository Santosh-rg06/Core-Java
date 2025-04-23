package com.xworkz.ub.internal.rule;

public interface SmartLight {
    void turnOn();
    void turnOff();
    void setBrightness(int level);
    void setColor(String color);
    void scheduleTimer(String time);
}
