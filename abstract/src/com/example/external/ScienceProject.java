package com.example.external;

import com.example.internal.Project;

public class ScienceProject extends Project {
    @Override
    public void name() {
        System.out.println("Volcano Eruption Simulation");
    }

    @Override
    public void objective() {
        System.out.println("To demonstrate a chemical reaction mimicking a volcanic eruption.");
    }

    @Override
    public void toolsUsed() {
        System.out.println("Baking soda, vinegar, clay, food coloring.");
    }

    @Override
    public void duration() {
        System.out.println("Completed in 3 days.");
    }

    @Override
    public void outcome() {
        System.out.println("Successfully simulated a realistic eruption with foaming lava.");
    }
}
