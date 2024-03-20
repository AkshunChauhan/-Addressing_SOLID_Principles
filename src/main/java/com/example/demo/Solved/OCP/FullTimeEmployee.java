package com.example.demo.Solved.OCP;
public class FullTimeEmployee implements Employee {
    private String name;
    private double salary;
    private double bonus;

    public FullTimeEmployee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    // Getters and setters (if needed)

    @Override
    public double calculatePay() {
        return salary + bonus;
    }
}