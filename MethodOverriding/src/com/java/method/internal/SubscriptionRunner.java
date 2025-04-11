package com.java.method.internal;

public class SubscriptionRunner {
    public static void main(String[] args) {
        Subscription s = new Subscription();
        s.accessContent();

        Subscription ps = new PremiumSubscription();
        ps.accessContent();

        PremiumSubscription premium = new PremiumSubscription();
        premium.accessContent();
        premium.adFreeExperience();
    }
}
