package com.java.method.internal;

public class HealingPotion extends Potion {
    public HealingPotion() {
        System.out.println("healing potion is being crafted");
    }

    @Override
    public void mix() {
        System.out.println("mixing herbs with magical essence");
    }

    public void apply() {
        System.out.println("healing potion applied to restore health");
    }
}
