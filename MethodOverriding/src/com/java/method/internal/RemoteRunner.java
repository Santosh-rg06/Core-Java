package com.java.method.internal;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote r = new Remote();
        r.powerButton();

        Remote sr = new SmartRemote();
        sr.powerButton();

        SmartRemote smart = new SmartRemote();
        smart.powerButton();
        smart.voiceControl();
    }
}
