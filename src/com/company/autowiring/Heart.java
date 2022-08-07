package com.company.autowiring;

public class Heart {

    private String nameOfAnimal;
    private int NumOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNumOfHeart() {
        return NumOfHeart;
    }

    public void setNumOfHeart(int numOfHeart) {
        NumOfHeart = numOfHeart;
    }

    public void beat(){
        System.out.println("Beating...");
        System.out.println("You're alive!");
    }
}
