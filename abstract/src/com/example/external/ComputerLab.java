package com.example.external;

import com.example.internal.Lab;

public class ComputerLab extends Lab {
    @Override
    public void labName() {
        System.out.println("Advanced Computing Laboratory");
    }

    @Override
    public void equipment() {
        System.out.println("Desktop computers, servers, routers, printers.");
    }

    @Override
    public void purpose() {
        System.out.println("For software development, networking, and simulations.");
    }

    @Override
    public void safetyMeasures() {
        System.out.println("Keep liquids away, avoid overloading circuits, backup data.");
    }

    @Override
    public void experimentsConducted() {
        System.out.println("Coding projects, database management, network setup.");
    }
}
