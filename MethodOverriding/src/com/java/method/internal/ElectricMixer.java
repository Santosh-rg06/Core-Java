package com.java.method.internal;

public class ElectricMixer extends Mixer {
    public ElectricMixer() {
        System.out.println("Electric mixer is ready");
    }

    @Override
    public void mix() {
        System.out.println("Mixing ingredients with electricity");
    }

    public void setSpeed() {
        System.out.println("Electric mixer speed set to medium");
    }
}
