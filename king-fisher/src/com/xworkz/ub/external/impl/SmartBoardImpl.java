package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartBoard;

public class SmartBoardImpl implements SmartBoard {
    public void displayLesson() {
        System.out.println("SmartBoard: Displaying today's lesson.");
    }
    public void switchInput() {
        System.out.println("SmartBoard: Input source switched.");
    }
    public void clearScreen() {
        System.out.println("SmartBoard: Screen cleared.");
    }
}
