package com.company.ioc;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling with Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing with Airtel");
    }
}
