package com.example.external;

import com.example.internal.Job;

public class EngineerJob extends Job {
    @Override
    public void describe() {
        System.out.println("An engineer applies scientific principles to solve problems.");
    }

    @Override
    public void responsibilities() {
        System.out.println("Designing, building, and testing systems or products.");
    }

    @Override
    public void requiredSkills() {
        System.out.println("Problem-solving, technical knowledge, analytical thinking.");
    }

    @Override
    public void workingEnvironment() {
        System.out.println("Can work in offices, labs, or field environments.");
    }

    @Override
    public void careerGrowth() {
        System.out.println("Can advance to senior engineer, manager, or technical lead.");
    }
}
