package com.example.demo.Solved.OCP;

public class Contractor implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructors, getters, and setters

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
