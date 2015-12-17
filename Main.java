#one more comment 

package com.example.food;

public class Main {

    public static void main(String args[]){

        SimpleLunch lunch1 = new SimpleLunch();
        Food tea = new Tea();
        Food greenTea = new Tea("Green tea");
        Food coffee = new Coffee();
        Food latte = new Coffee("Latte");
        Food soup = new Soup();
        Food potato = new Potato();
        Food friedPotato = new Potato("Fried potato");
        Food meat = new Meat();
        Food friedMeat = new Meat("Fried meat");
        lunch1.add(tea);
        lunch1.add(greenTea);
        lunch1.add(soup);
        lunch1.add(potato);
        lunch1.add(meat);
        lunch1.delete(tea);
        lunch1.eatLunch();
        lunch1.printLunch();

        SimpleLunch lunch2 = new SimpleLunch();
        lunch2.add(coffee);
        lunch2.add(meat);
        lunch2.eatOne(coffee);
        lunch2.printLunch();

        SimpleLunch lunch3 = new SimpleLunch();
        lunch3.add(friedPotato);
        lunch3.add(friedMeat);
        lunch3.add(latte);
        lunch3.eatLunch();
        lunch3.printLunch();


    }
}
