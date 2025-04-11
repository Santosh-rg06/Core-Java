package com.java.method.internal;

public class MusicFestival extends Event {
    public MusicFestival() {
        System.out.println("music festival setup completed");
    }

    @Override
    public void schedule() {
        System.out.println("band performance starts at 7 PM");
    }

    public void sellTickets() {
        System.out.println("tickets are being sold online");
    }
}
