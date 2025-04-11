package com.java.method.internal;

public class RegisteredVoter extends Voter {
    public RegisteredVoter() {
        System.out.println("Registered voter verified");
    }

    @Override
    public void vote() {
        System.out.println("Registered voter is casting vote through EVM");
    }

    public void showVoterID() {
        System.out.println("Displaying official Voter ID card");
    }
}
