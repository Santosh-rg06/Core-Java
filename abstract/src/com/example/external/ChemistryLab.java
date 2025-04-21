package com.example.external;

import com.example.internal.Lab;

public class ChemistryLab extends Lab {
    @Override
    public void labName() {
        System.out.println("Organic Chemistry Laboratory");
    }

    @Override
    public void equipment() {
        System.out.println("Beakers, Bunsen burners, test tubes, chemicals.");
    }

    @Override
    public void purpose() {
        System.out.println("Used for conducting chemical reactions and studying compounds.");
    }

    @Override
    public void safetyMeasures() {
        System.out.println("Wear goggles, gloves, and lab coat. Handle acids carefully.");
    }

    @Override
    public void experimentsConducted() {
        System.out.println("Titration, synthesis of esters, acid-base reactions.");
    }
}
