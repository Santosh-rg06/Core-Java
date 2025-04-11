package com.java.method.internal;

public class Rocket extends Satellite {
    public Rocket() {
        System.out.println("rocket has been launched into space");
    }

    @Override
    public void transmit() {
        System.out.println("rocket is sending data back to base");
    }

    public void deployPayload() {
        System.out.println("rocket deployed satellite successfully");
    }
}
