package com.xworkz.ub.runner;

import com.xworkz.ub.external.impl.ApolloHospital;
import com.xworkz.ub.internal.rule.Hospital;
public class HospitalRunner {

    public static void main(String[] args){
    Hospital hospital = new ApolloHospital();
    hospital.clean();
}
}
