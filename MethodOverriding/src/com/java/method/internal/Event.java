package com.java.method.internal;

public class Event {
    protected Event() {
        System.out.println("event is being organized");
    }

    public void schedule() {
        System.out.println("event scheduled for the evening");
    }
}
