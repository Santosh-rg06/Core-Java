package com.xworks.encapsulation.internal;

public class MutantUser {
    public void test() {
        Mutant mutant = new Mutant();
        mutant.setName("Logan");
        mutant.setPower("Regeneration");
        mutant.setLevel(9);
        mutant.setHero(true);
        mutant.setScore(92.5);

        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Hero? " + mutant.isHero());

        mutant.mutate();
    }
}
