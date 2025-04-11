package com.java.method.internal;

public class ChemistryLab extends Experiment {
    public ChemistryLab() {
        System.out.println("chemistry lab setup is complete");
    }

    @Override
    public void perform() {
        System.out.println("performing a chemical reaction test");
    }

    public void recordResults() {
        System.out.println("results recorded in lab notebook");
    }
}
