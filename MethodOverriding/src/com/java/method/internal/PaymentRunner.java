package com.java.method.internal;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.processTransaction();

        Payment op = new OnlinePayment();
        op.processTransaction();

        OnlinePayment online = new OnlinePayment();
        online.processTransaction();
        online.verifyOTP();
    }
}
