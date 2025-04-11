package com.java.method.internal;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        System.out.println("bluetooth speaker activated");
    }

    @Override
    public void play() {
        System.out.println("playing music via Bluetooth");
    }

    public void connectDevice() {
        System.out.println("device connected to Bluetooth speaker");
    }
}
