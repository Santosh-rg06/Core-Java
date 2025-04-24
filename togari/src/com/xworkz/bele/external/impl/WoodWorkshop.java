package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Workshop;

public class WoodWorkshop implements Workshop {

    @Override
    public void cutWood() {
        System.out.println("Cutting wood using electric saw");
    }

    @Override
    public void weldMetal() {
        System.out.println("Welding metal parts together");
    }

    @Override
    public void paintSurface() {
        System.out.println("Painting finished furniture");
    }

    @Override
    public void useTools() {
        System.out.println("Using drill, hammer and saw safely");
    }

    @Override
    public void ensureSafety() {
        System.out.println("Wearing safety goggles and gloves");
    }
}
