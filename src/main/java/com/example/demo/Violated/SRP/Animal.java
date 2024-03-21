package com.example.demo.Violated.SRP;

import java.util.List;

public class Animal {
    private String species;
    private int age;
    private List<String> diet;

    // Constructor to initialize an Animal object with species, age, and diet
    public Animal(String species, int age, List<String> diet) {
        this.species = species;
        this.age = age;
        this.diet = diet;
    }

    // Method to simulate eating behavior of the animal
    public void eat(String food) {
        System.out.println(species + " eats " + food + "!");
    }

    // Method to simulate sleeping behavior of the animal
    public void sleep() {
        System.out.println(species + " sleeps.");
    }

    // Method to simulate making a sound behavior of the animal
    public void makeSound() {
        System.out.println(species + " makes a sound.");
    }

    // Method to simulate aging behavior of the animal
    public void growOlder() {
        age++;
        System.out.println(species + " grows older.");
    }
}
