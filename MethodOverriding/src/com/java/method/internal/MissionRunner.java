package com.java.method.internal;

public class MissionRunner {
    public static void main(String[] args) {
        Mission m = new Mission();
        m.execute();

        Mission moon = new MoonMission();
        moon.execute();

        MoonMission moonMission = new MoonMission();
        moonMission.execute();
        moonMission.land();
    }
}
