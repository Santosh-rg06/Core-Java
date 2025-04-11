package com.java.method.internal;

public class MatchBoxRunner {
    public static void main(String[] args) {
        MatchBox m = new MatchBox();
        m.ignite();

        MatchBox sm = new SafetyMatchBox();
        sm.ignite();

        SafetyMatchBox safe = new SafetyMatchBox();
        safe.ignite();
        safe.seal();
    }
}
