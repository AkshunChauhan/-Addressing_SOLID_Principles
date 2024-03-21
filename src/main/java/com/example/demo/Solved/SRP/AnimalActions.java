package com.example.demo.Solved.SRP;

// Importing the Animal class from the same package
import com.example.demo.Solved.SRP.Animal;

public class AnimalActions {
    // Method to simulate the eating behavior of an animal
    public void eat(Animal animal, String food) {
        // Print a message indicating that the animal is eating the specified food
        System.out.println(animal.getSpecies() + " eats " + food + "!");
    }

    // Method to simulate the sleeping behavior of an animal
    public void sleep(Animal animal) {
        // Print a message indicating that the animal is sleeping
        System.out.println(animal.getSpecies() + " sleeps.");
    }

    // Method to simulate the making sound behavior of an animal
    public void makeSound(Animal animal) {
        // Print a message indicating that the animal is making a sound
        System.out.println(animal.getSpecies() + " makes a sound.");
    }
}
