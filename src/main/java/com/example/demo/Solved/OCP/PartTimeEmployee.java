package com.example.demo.Solved.OCP;

public class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters (if needed)

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}