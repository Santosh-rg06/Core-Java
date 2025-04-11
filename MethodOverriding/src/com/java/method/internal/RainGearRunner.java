package com.java.method.internal;

public class RainGearRunner {
    public static void main(String[] args) {
        Umbrella u = new Umbrella();
        u.protect();

        Umbrella f = new FoldingUmbrella();
        f.protect();

        FoldingUmbrella fu = new FoldingUmbrella();
        fu.protect();
        fu.fold();
    }
}
