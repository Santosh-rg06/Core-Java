package com.java.method.internal;

public class HeavySnowfall extends Snowfall {
    public HeavySnowfall() {
        System.out.println("Heavy snowfall warning issued");
    }

    @Override
    public void intensity() {
        System.out.println("Intense snowfall with roadblocks expected");
    }

    public void issueAlert() {
        System.out.println("Emergency alert: Avoid travel due to heavy snowfall");
    }
}
