package com.example.food;

public class Tea implements Food{

    private boolean isEaten;
    private String name;

    public Tea(){
        isEaten = false;
        name = "Tea";
    }

    public Tea(String name){
        isEaten = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void eat() {
        isEaten = true;
    }

}
