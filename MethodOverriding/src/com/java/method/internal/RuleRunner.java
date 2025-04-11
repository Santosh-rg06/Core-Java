package com.java.method.internal;

public class RuleRunner {
    public static void main(String[] args) {
        Rule r = new Rule();
        r.applyRule();

        Rule tr = new TrafficRule();
        tr.applyRule();

        TrafficRule traffic = new TrafficRule();
        traffic.applyRule();
        traffic.fineViolation();
    }
}
