package com.java.method.internal;

public class DenseFog extends Fog {
    public DenseFog() {
        System.out.println("Dense fog is forming...");
    }

    @Override
    public void visibility() {
        System.out.println("Visibility is heavily reduced due to dense fog");
    }

    public void activateWarningLights() {
        System.out.println("Warning lights activated for dense fog");
    }
}
