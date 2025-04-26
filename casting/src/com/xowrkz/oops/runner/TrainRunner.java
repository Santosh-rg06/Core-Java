package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Train;
import com.xowrkz.oops.internal.MetroTrain;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train();
        train.run();

        Train metroAsTrain = new MetroTrain(); // Upcasting
        metroAsTrain.run();

        System.out.println("**********");

        MetroTrain metro = new MetroTrain();
        metro.run();
        metro.announceNextStation();

        Train original = new Train();
        original.setName("Rajdhani Express");
        original.setCoaches(22);

        Train copy = new Train(original);
        System.out.println(copy);
    }
}
