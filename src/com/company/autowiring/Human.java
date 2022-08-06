package com.company.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;

    public Human() {
    }


    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startBeating() {
        if (heart != null) {
            heart.beat();
        } else {
            System.out.println("You're dead!");
        }

    }
}
