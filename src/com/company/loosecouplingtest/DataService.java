package com.company.loosecouplingtest;

public class DataService implements Service{

    @Override
    public void service() {
        System.out.println("Using data service");
    }
}
