package com.java.method.internal;

public class FestivalRunner {
    public static void main(String[] args) {
        Event e = new Event();
        e.schedule();

        Event m = new MusicFestival();
        m.schedule();

        MusicFestival mf = new MusicFestival();
        mf.schedule();
        mf.sellTickets();
    }
}
