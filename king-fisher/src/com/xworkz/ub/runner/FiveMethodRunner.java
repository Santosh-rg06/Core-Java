package com.xworkz.ub.runner;

import com.xworkz.ub.external.impl.*;
import com.xworkz.ub.internal.rule.*;

public class FiveMethodRunner {
    public static void main(String[] args) {

        SmartLight light = new SmartLightImpl();
        light.turnOn();
        light.setColor("Blue");
        light.setBrightness(75);
        light.scheduleTimer("10:00 PM");
        light.turnOff();

        SmartSpeaker speaker = new SmartSpeakerImpl();
        speaker.connectBluetooth();
        speaker.playMusic();
        speaker.setVolume(60);
        speaker.pauseMusic();
        speaker.disconnectBluetooth();

        AirPurifier purifier = new AirPurifierImpl();
        purifier.powerOn();
        purifier.setSpeed(3);
        purifier.checkAirQuality();
        purifier.cleanFilter();
        purifier.powerOff();

        SmartBlinds blinds = new SmartBlindsImpl();
        blinds.open();
        blinds.setAngle(45);
        blinds.scheduleClose("8:00 PM");
        blinds.close();

        SmartDesk desk = new SmartDeskImpl();
        desk.adjustHeight(110);
        desk.enableReminder();
        desk.showUsageStats();
        desk.lockHeight();
        desk.disableReminder();
    }
}
