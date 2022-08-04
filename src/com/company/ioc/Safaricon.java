package com.company.ioc;

public class Safaricon implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling with Safaricom");
    }

    @Override
    public void data() {
        System.out.println("Browsing with Safaricom");
    }
}
