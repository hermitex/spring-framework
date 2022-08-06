package com.company.loosecoupling;

public class JavaCheat implements Cheat{
    private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    @Override
    public void cheat() {
        System.out.println("Java cheat started...");
    }
}
