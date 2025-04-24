package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.MusicRoom;

public class ClassicMusicRoom implements MusicRoom {

    @Override
    public void playInstrument() {
        System.out.println("Playing the piano in the music room");
    }

    @Override
    public void practiceVocals() {
        System.out.println("Practicing vocals daily");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning the guitar");
    }

    @Override
    public void recordMusic() {
        System.out.println("Recording music session");
    }

    @Override
    public void organizeConcert() {
        System.out.println("Organizing a home concert");
    }
}
