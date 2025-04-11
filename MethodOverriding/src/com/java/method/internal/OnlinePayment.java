package com.java.method.internal;

public class OnlinePayment extends Payment {
    public OnlinePayment() {
        System.out.println("Online payment initialized");
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing payment through online gateway");
    }

    public void verifyOTP() {
        System.out.println("Verifying OTP for secure payment");
    }
}
