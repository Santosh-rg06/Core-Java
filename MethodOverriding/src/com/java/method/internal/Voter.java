package com.java.method.internal;

public class Voter {
    protected Voter() {
        System.out.println("Voter profile created");
    }

    public void vote() {
        System.out.println("Voter is eligible to cast a vote");
    }
}
