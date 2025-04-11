package com.java.method.internal;

public class PremiumSubscription extends Subscription {
    public PremiumSubscription() {
        System.out.println("Premium subscription is active");
    }

    @Override
    public void accessContent() {
        System.out.println("Premium content is available for this subscription");
    }

    public void adFreeExperience() {
        System.out.println("Enjoy an ad-free experience with Premium Subscription");
    }
}
