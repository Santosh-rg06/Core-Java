package com.java.method.internal;

public class VoterRunner {
    public static void main(String[] args) {
        Voter v = new Voter();
        v.vote();

        Voter rv = new RegisteredVoter();
        rv.vote();

        RegisteredVoter reg = new RegisteredVoter();
        reg.vote();
        reg.showVoterID();
    }
}
