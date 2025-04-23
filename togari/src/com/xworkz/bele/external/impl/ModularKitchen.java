package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Kitchen;

public class ModularKitchen implements Kitchen {
    @Override
    public void cook() {
        System.out.println("Cooking in a modular kitchen");
    }
}
