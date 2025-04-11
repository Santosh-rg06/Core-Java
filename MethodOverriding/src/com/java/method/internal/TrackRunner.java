package com.java.method.internal;

public class TrackRunner {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.compete();

        Athlete r = new RunnerAthlete();
        r.compete();

        RunnerAthlete ra = new RunnerAthlete();
        ra.compete();
        ra.stretch();
    }
}
