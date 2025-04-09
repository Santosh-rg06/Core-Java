package com.xworks.encapsulation.internal;

public class TankUser {
    public void test() {
        Tank tank = new Tank();
        tank.setModel("Arjun");
        tank.setCountry("India");
        tank.setCrewCount(4);
        tank.setActive(true);
        tank.setFirepower(125.0);

        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Active? " + tank.isActive());

        tank.fire();
    }
}
