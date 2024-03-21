package com.example.demo.Solved.SRP;

import java.util.List;

public class Animal {
    // Attributes of the animal
    private String species;
    private int age;
    private List<String> diet;

    // Constructor to initialize an Animal object with species, age, and diet
    public Animal(String species, int age, List<String> diet) {
        this.species = species;
        this.age = age;
        this.diet = diet;
    }

    // Getter method to retrieve the species of the animal
    public String getSpecies() {
        return species;
    }

    // Getter method to retrieve the age of the animal
    public int getAge() {
        return age;
    }

    // Getter method to retrieve the diet of the animal
    public List<String> getDiet() {
        return diet;
    }

    // Method to simulate the aging process of the animal
    public void growOlder() {
        age++; // Increase the age by 1
        System.out.println(species + " grows older."); // Print a message
    }
}
