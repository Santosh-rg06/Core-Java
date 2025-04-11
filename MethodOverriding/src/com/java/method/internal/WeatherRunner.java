package com.java.method.internal;

public class WeatherRunner {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.read();

        Sensor r = new RainSensor();
        r.read();

        RainSensor rs = new RainSensor();
        rs.read();
        rs.alert();
    }
}
