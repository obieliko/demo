package com.example.food;

import java.util.*;

public class SimpleLunch {
    public ArrayList<Food> listOfDishes = new ArrayList<Food>();

    public void add(Food food) {
        listOfDishes.add(food);
    }

    public void delete(Food food) {
        listOfDishes.remove(food);
    }

    public void eatLunch() {
        for (Food var: listOfDishes) {
            var.eat();
        }
    }

    public void eatOne(Food food) {
        for (Food var: listOfDishes) {
            if (var.equals(food)) {
                var.eat();
                delete(var);
            }
        }
    }

    public void printLunch() {
        System.out.print("Lunch: ");
        for (Food var: listOfDishes) {
            if (var.isEaten()){
                System.out.print(var.getName() + " ");
            }
        }
        System.out.println();

    }

}