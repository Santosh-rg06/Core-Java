package com.java.method.internal;

public class AlarmRunner {
    public static void main(String[] args) {
        Alarm a = new Alarm();
        a.ring();

        Alarm s = new SmartAlarm();
        s.ring();

        SmartAlarm sa = new SmartAlarm();
        sa.ring();
        sa.snooze();
    }
}
