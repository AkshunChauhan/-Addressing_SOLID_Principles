package com.example.demo.Violated.OCP;

// File: src/test/java/com/example/solved/EmployeeTest.java

import com.example.demo.Solved.OCP.FullTimeEmployee;
import com.example.demo.Solved.OCP.PartTimeEmployee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testFullTimeEmployeePayCalculation() {
        com.example.demo.Solved.OCP.FullTimeEmployee employee = new FullTimeEmployee("John", 5000, 3000);
        // Calculate expected pay: salary + bonus
        double expectedPay = 5000 + 3000;
        // Compare expected pay with the actual pay calculated by the employee object
        assertEquals(expectedPay, employee.calculatePay(), 0);
    }

    @Test
    public void testPartTimeEmployeePayCalculation() {
        com.example.demo.Solved.OCP.PartTimeEmployee employee = new PartTimeEmployee("Alice", 20, 30);
        // Calculate expected pay: hourlyRate * hoursWorked
        double expectedPay = 20 * 30;
        // Compare expected pay with the actual pay calculated by the employee object
        assertEquals(expectedPay, employee.calculatePay(), 0);
    }
}
