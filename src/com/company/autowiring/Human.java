package com.company.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;

    public Human() {

    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startBeating() {
        if (heart != null) {
            heart.beat();
            System.out.println("Name of the animal is: "+heart.getNameOfAnimal());
        } else {
            System.out.println("You're dead!");
        }

    }
}
