package com.example.demo.Solved.LSP;

public class Main {
    public static void main(String[] args) {
        // Example usage of the classes

        // Creating instances of different vehicles
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bicycle bicycle = new Bicycle();

        // Demonstrating polymorphism
        EnginePoweredVehicle[] vehicles = {car, motorcycle};
        for (EnginePoweredVehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
