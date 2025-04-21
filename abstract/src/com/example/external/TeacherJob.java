package com.example.external;

import com.example.internal.Job;

public class TeacherJob extends Job {
    @Override
    public void describe() {
        System.out.println("A teacher educates students in various subjects.");
    }

    @Override
    public void responsibilities() {
        System.out.println("Preparing lessons, teaching, and evaluating students.");
    }

    @Override
    public void requiredSkills() {
        System.out.println("Communication, patience, subject knowledge.");
    }

    @Override
    public void workingEnvironment() {
        System.out.println("Usually works in schools or educational institutions.");
    }

    @Override
    public void careerGrowth() {
        System.out.println("Can become head of department, principal, or education consultant.");
    }
}
