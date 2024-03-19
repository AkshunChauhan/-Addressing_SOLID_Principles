package com.example.demo.Violated.LSP;

public class Bicycle extends Vehicle {
    // LSP Violation: Bicycle should not have startEngine() method
    @Override
    public void startEngine() {

        // This method is not applicable to bicycles
        // Violates LSP as it changes the expected behavior
    }
}
