package com.java.method.internal;

public class RechargeableTorch extends Torch {
    public RechargeableTorch() {
        System.out.println("Rechargeable torch is ready to use");
    }

    @Override
    public void lightUp() {
        System.out.println("Torch is lighting up with rechargeable battery");
    }

    public void charge() {
        System.out.println("Torch is being charged now");
    }
}
