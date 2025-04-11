package com.java.method.internal;

public class TorchRunner {
    public static void main(String[] args) {
        Torch t = new Torch();
        t.lightUp();

        Torch rt = new RechargeableTorch();
        rt.lightUp();

        RechargeableTorch recharge = new RechargeableTorch();
        recharge.lightUp();
        recharge.charge();
    }
}
