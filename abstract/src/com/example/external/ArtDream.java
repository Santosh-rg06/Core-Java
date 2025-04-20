package com.example.external;


import com.example.internal.Dream;

public class ArtDream extends Dream {
    @Override
    public void pursue() {
        System.out.println("Practicing drawing and painting every day.");
    }

    @Override
    public void describe() {
        System.out.println("A dream to become a professional artist.");
    }

    @Override
    public void visualize() {
        System.out.println("Imagining my art displayed in galleries.");
    }

    @Override
    public void achieve() {
        System.out.println("Creating a portfolio and selling art.");
    }

    @Override
    public void reflect() {
        System.out.println("Looking at past works to see growth.");
    }
}

