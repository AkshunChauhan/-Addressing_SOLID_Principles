package com.example.demo.Solved.OCP;

// PartTimeEmployee class representing a part-time employee
public class PartTimeEmployee implements Employee {

    // Private member variables to store employee information
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize the PartTimeEmployee object
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override method to calculate pay for the part-time employee
    @Override
    public double calculatePay() {
        // Calculate pay by multiplying hourly rate by hours worked
        return hourlyRate * hoursWorked;
    }
}
