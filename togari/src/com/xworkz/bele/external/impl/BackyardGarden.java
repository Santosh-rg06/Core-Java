package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Garden;

public class BackyardGarden implements Garden {

    @Override
    public void waterPlants() {
        System.out.println("Watering plants in the backyard garden");
    }

    @Override
    public void trimHedges() {
        System.out.println("Trimming hedges in the backyard garden");
    }

    @Override
    public void plantFlowers() {
        System.out.println("Planting flowers in the backyard garden");
    }
}
