package com.java.method.internal;

public class BrewRunner {
    public static void main(String[] args) {
        Potion p = new Potion();
        p.mix();

        Potion h = new HealingPotion();
        h.mix();

        HealingPotion heal = new HealingPotion();
        heal.mix();
        heal.apply();
    }
}
