package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Mutant;

public class MutantViewer {
    public void display() {
        Mutant mutant = new Mutant();

        // Since no data is set, these will show default values
        System.out.println("Mutant Info (read-only):");
        System.out.println("Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Level: " + mutant.getLevel());
        System.out.println("Hero? " + mutant.isHero());
        System.out.println("Score: " + mutant.getScore());
    }
}
