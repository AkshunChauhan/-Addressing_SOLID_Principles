package com.example.demo.Violated.OCP;
public class FullTimeEmployee extends Employee {
    private double bonus;

    // Constructors, getters, and setters

    @Override
    public double calculatePay() {
        // Calculation includes bonus for full-time employees
        return super.calculatePay() + bonus;
    }
}
