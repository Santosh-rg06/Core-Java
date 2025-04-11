package com.java.method.internal;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror m = new Mirror();
        m.reflect();

        Mirror sm = new SmartMirror();
        sm.reflect();

        SmartMirror smart = new SmartMirror();
        smart.reflect();
        smart.showWeather();
    }
}
