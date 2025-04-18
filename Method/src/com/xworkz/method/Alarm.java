package com.xworkz.method;

import java.util.Objects;

public class Alarm {
    private String time;
    private boolean isActive;
    private String label;
    private int volume;

    public Alarm(String time, boolean isActive, String label, int volume) {
        this.time = time;
        this.isActive = isActive;
        this.label = label;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "time='" + time + '\'' +
                ", isActive=" + isActive +
                ", label='" + label + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Alarm) {
            Alarm other = (Alarm) obj;
            if (Objects.equals(this.time, other.time) &&
                    this.isActive == other.isActive) {
                System.out.println("Alarm is matching..");
                return true;
            }
        }
        return false;
    }
}
