package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Tank;

public class TankViewer {
    public void display() {
        Tank tank = new Tank();
        System.out.println("Viewing Tank Info:");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Crew Count: " + tank.getCrewCount());
        System.out.println("Active? " + tank.isActive());
        System.out.println("Firepower: " + tank.getFirepower());
    }
}
