package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Studio;

public class EditingStudio implements Studio {

    @Override
    public void shootVideo() {
        System.out.println("Shooting a short film in the studio");
    }

    @Override
    public void editFootage() {
        System.out.println("Editing footage using software");
    }

    @Override
    public void addEffects() {
        System.out.println("Adding VFX and transitions");
    }

    @Override
    public void renderVideo() {
        System.out.println("Rendering final output in HD");
    }

    @Override
    public void publishContent() {
        System.out.println("Publishing video on streaming platform");
    }
}
