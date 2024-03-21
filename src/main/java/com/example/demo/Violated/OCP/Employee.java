package com.example.demo.Violated.OCP;

public class Employee {
    private String name;
    private double salary;

    public double calculatePay() {
        // Base implementation for calculating pay
        return salary;
    }
}
