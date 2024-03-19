// Main.java (in the violation folder)
package com.example.demo.Violated.LSP;



public class Main {
    public static void main(String[] args) {
        // Example usage of the classes

        // Creating instances of different vehicles
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bicycle bicycle = new Bicycle();

        // Demonstrating the violation of LSP by calling startEngine() on Bicycle
        car.startEngine(); // Car's startEngine method is appropriate
        motorcycle.startEngine(); // Motorcycle's startEngine method is appropriate
        bicycle.startEngine(); // Violates LSP, Bicycle should not have startEngine method
    }
}
