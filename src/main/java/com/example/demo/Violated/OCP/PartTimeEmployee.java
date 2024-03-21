package com.example.demo.Violated.OCP;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    @Override
    public double calculatePay() {
        // Calculation for part-time employee pay based on hours worked and hourly rate
        return hourlyRate * hoursWorked;
    }
}
