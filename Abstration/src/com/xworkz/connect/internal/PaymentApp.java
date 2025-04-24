package com.xworkz.connect.internal;

public class PaymentApp {
    private Payment payment;

    public PaymentApp(Payment payment) {
        this.payment = payment;
    }

    public void details() {
        if (payment != null) {
            System.out.println("Initiating payment");
            payment.save();
        } else {
            System.out.println("Payment not configured");
        }
    }
}
