package com.java.method.internal;

public class LabRunner {
    public static void main(String[] args) {
        Experiment e = new Experiment();
        e.perform();

        Experiment c = new ChemistryLab();
        c.perform();

        ChemistryLab lab = new ChemistryLab();
        lab.perform();
        lab.recordResults();
    }
}
