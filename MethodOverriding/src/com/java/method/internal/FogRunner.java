package com.java.method.internal;

public class FogRunner {
    public static void main(String[] args) {
        Fog fog = new Fog();
        fog.visibility();

        Fog dense = new DenseFog();
        dense.visibility();

        DenseFog df = new DenseFog();
        df.visibility();
        df.activateWarningLights();
    }
}
