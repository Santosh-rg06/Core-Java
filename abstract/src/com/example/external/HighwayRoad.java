package com.example.external;

import com.example.internal.Road;

public class HighwayRoad extends Road {
    @Override
    public void define() {
        System.out.println("Highways are long-distance roads connecting cities and states.");
    }

    @Override
    public void materialUsed() {
        System.out.println("Constructed with concrete, asphalt, and reinforced materials.");
    }

    @Override
    public void purpose() {
        System.out.println("Designed for fast travel and heavy goods transport.");
    }

    @Override
    public void trafficType() {
        System.out.println("High-speed vehicles, including trucks and long-distance buses.");
    }

    @Override
    public void maintenance() {
        System.out.println("Maintained by national or state highway authorities.");
    }
}
