package com.java.method.internal;

public class MoonMission extends Mission {
    public MoonMission() {
        System.out.println("moon mission systems are online");
    }

    @Override
    public void execute() {
        System.out.println("moon mission is collecting lunar data");
    }

    public void land() {
        System.out.println("lander has touched down on the moon");
    }
}
