package com.java.method.internal;

public class BuildRunner {
    public static void main(String[] args) {
        Structure s = new Structure();
        s.design();

        Structure b = new Bridge();
        b.design();

        Bridge bridge = new Bridge();
        bridge.design();
        bridge.testLoad();
    }
}
