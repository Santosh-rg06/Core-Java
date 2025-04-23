package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Bathroom;

public class LuxuryBathroom implements Bathroom {
    @Override
    public void shower() {
        System.out.println("Taking a shower in the luxury bathroom");
    }
}
