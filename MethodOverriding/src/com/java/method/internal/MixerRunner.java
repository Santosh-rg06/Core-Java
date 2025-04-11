package com.java.method.internal;

public class MixerRunner {
    public static void main(String[] args) {
        Mixer m = new Mixer();
        m.mix();

        Mixer em = new ElectricMixer();
        em.mix();

        ElectricMixer electric = new ElectricMixer();
        electric.mix();
        electric.setSpeed();
    }
}
