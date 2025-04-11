package com.java.method.internal;

public class SmartWatchRunner {
    public static void main(String[] args) {
        WearableDevice wd = new WearableDevice();
        wd.showFeatures();

        WearableDevice sw = new SmartWatch();
        sw.showFeatures();

        SmartWatch watch = new SmartWatch();
        watch.showFeatures();
        watch.trackSleep();
    }
}
