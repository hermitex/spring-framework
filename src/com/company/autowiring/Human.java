package com.company.autowiring;

public class Human {
    private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }

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
