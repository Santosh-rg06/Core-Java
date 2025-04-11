package com.java.method.internal;

public class SilverMemberRunner {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.showBenefits();

        Membership s = new SilverMember();
        s.showBenefits();

        SilverMember silver = new SilverMember();
        silver.showBenefits();
        silver.accessLounge();
    }
}
