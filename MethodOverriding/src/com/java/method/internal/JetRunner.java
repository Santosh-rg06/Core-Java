package com.java.method.internal;

public class JetRunner {
    public static void main(String[] args) {
        PrivateTransport pt = new PrivateTransport();
        pt.travel();

        PrivateTransport pj = new PrivateJet();
        pj.travel();

        PrivateJet jet = new PrivateJet();
        jet.travel();
        jet.flightDuration();
    }
}
