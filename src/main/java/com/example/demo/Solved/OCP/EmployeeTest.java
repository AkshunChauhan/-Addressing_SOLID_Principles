package com.example.demo.Solved.OCP;

// File: src/test/java/com/example/solved/EmployeeTest.java

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testFullTimeEmployeePayCalculation() {
        FullTimeEmployee employee = new FullTimeEmployee("John", 5000, 3000);
        // Calculate expected pay: salary + bonus
        double expectedPay = 5000 + 3000;
        // Compare expected pay with the actual pay calculated by the employee object
        assertEquals(expectedPay, employee.calculatePay(), 0);
    }

    @Test
    public void testPartTimeEmployeePayCalculation() {
        PartTimeEmployee employee = new PartTimeEmployee("Alice", 20, 30);
        // Calculate expected pay: hourlyRate * hoursWorked
        double expectedPay = 20 * 30;
        // Compare expected pay with the actual pay calculated by the employee object
        assertEquals(expectedPay, employee.calculatePay(), 0);
    }
}
