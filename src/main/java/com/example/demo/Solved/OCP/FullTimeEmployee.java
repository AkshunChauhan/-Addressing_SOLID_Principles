package com.example.demo.Solved.OCP;

// FullTimeEmployee class representing a full-time employee
public class FullTimeEmployee implements Employee {

    // Private member variables to store employee information
    private String name;
    private double salary;
    private double bonus;

    // Constructor to initialize the FullTimeEmployee object
    public FullTimeEmployee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    // Override method to calculate pay for the full-time employee
    @Override
    public double calculatePay() {
        // Calculate pay by adding base salary and bonus
        return salary + bonus;
    }
}
