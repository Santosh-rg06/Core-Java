package com.xworkz.connect.runner;

import com.xworkz.connect.internal.CreditPayment;
import com.xworkz.connect.internal.UpiPayment;
import com.xworkz.connect.internal.Payment;
import com.xworkz.connect.internal.PaymentApp;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment creditPayment = new CreditPayment();


        Payment upiPayment = new UpiPayment();
        upiPayment.save();

        PaymentApp app = new PaymentApp(creditPayment);
        app.details();
    }
}
