package com.xworkz.ub.internal.rule;

public interface AirPurifier {
    void powerOn();
    void powerOff();
    void setSpeed(int speed);
    void checkAirQuality();
    void cleanFilter();
}
