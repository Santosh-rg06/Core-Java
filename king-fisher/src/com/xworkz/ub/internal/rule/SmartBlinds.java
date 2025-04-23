package com.xworkz.ub.internal.rule;

public interface SmartBlinds {
    void open();
    void close();
    void setAngle(int angle);
    void scheduleOpen(String time);
    void scheduleClose(String time);
}
