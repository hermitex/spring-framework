package com.company.loosecouplingtest;

public class CallService implements Service{

    @Override
    public void service() {
        System.out.println("Using call service");
    }
}
