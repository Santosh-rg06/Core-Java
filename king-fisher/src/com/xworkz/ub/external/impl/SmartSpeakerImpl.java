package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartSpeaker;

public class SmartSpeakerImpl implements SmartSpeaker {
    public void playMusic() {
        System.out.println("SmartSpeaker: Playing music.");
    }
    public void pauseMusic() {
        System.out.println("SmartSpeaker: Music paused.");
    }
    public void setVolume(int level) {
        System.out.println("SmartSpeaker: Volume set to " + level + ".");
    }
    public void connectBluetooth() {
        System.out.println("SmartSpeaker: Connected to Bluetooth.");
    }
    public void disconnectBluetooth() {
        System.out.println("SmartSpeaker: Disconnected from Bluetooth.");
    }
}
