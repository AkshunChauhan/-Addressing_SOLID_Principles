# Liskov Substitution Principle (LSP)  Violation and Solution


## Violation:

- The `Bicycle` class inherited a `startEngine()` method from its superclass `Vehicle`.
- Bicycles do not have engines, making the presence of `startEngine()` method inappropriate and violating the Liskov Substitution Principle.

## Solution:

- Refactored class hierarchy to separate vehicles with engines from those without engines.
- Introduced an abstract superclass `Vehicle` containing common attributes and behaviors.
- Created a subclass `EnginePoweredVehicle` to represent vehicles with engines.
- Removed the `startEngine()` method from the `Vehicle` superclass.
- Implemented the `startEngine()` method only in subclasses representing vehicles with engines, such as `Car` and `Motorcycle`.

## Outcome:

- Resolved violation of Liskov Substitution Principle by aligning class responsibilities and behaviors.
- Improved code clarity, encapsulation, and adherence to object-oriented design principles.
- Promoted better maintainability and scalability of the codebase.

## Conclusion:

- The revised design ensures that each class adheres to its defined responsibilities and maintains substitutability.
- Our codebase is now more robust, easier to maintain, and better aligned with SOLID design principles.
- This approach fosters a more organized and scalable architecture for future development efforts.

---
# Open-Closed Principle (OCP) Violation and Solution

## Introduction OCP
The Open-Closed Principle (OCP) is a fundamental concept in object-oriented design, emphasizing that software entities should be open for extension but closed for modification. This principle promotes code that is more maintainable, flexible, and scalable over time.

## Violation
In our codebase, certain classes were found to be violating the OCP. Specifically, the `PartTimeEmployee` and `FullTimeEmployee` classes directly implemented the `Employee` interface, which made it challenging to extend the system with new types of employees without modifying existing code.

## Solution
To address the violation of the OCP, the following steps were taken:

1. **Abstraction of Employee Types:**
    - Introduced a new abstraction layer to represent different types of employees.
    - Created an abstract base class named `Employee` to define common properties and methods.

2. **Implementation of Employee Subtypes:**
    - Refactored `PartTimeEmployee` and `FullTimeEmployee` to extend the `Employee` base class.
    - Implemented specific behaviors for each employee type within their respective subclasses.

3. **Refactoring Existing Code:**
    - Updated constructors, getters, and setters to reflect changes in class hierarchy and member variables.

4. **Testing and Validation:**
    - Executed unit tests to ensure that refactored classes behave as expected and pass relevant test cases.
    - Conducted integration tests to validate that changes do not introduce regressions.

## Outcome
After implementing these changes:
- The violation of the OCP was addressed, and the codebase now adheres more closely to object-oriented design principles.
- The `Employee` hierarchy provides a flexible structure for easy extension with minimal impact on existing code.
- Refactored classes have been organized into the appropriate solution folder.

## Conclusion
By proactively identifying and addressing violations of the OCP, we have improved the maintainability, flexibility, and scalability of our codebase. Adherence to established design principles ensures that our software remains adaptable to future changes and enhancements.

---


# Single Responsibility Principle (SRP) Violation and Solution

## Introduction SRP
The Single Responsibility Principle (SRP) is a fundamental principle of object-oriented design that emphasizes that a class should have only one reason to change.

## Violation
- The `Animal` class in the codebase is responsible for both storing attributes of an animal and simulating behaviors/actions.
- This violates SRP as the class has multiple reasons to change, reducing modularity and maintainability.
- Modifications related to attributes or behaviors require changes in the same class, leading to coupling of responsibilities.

## Solution
- Introduce separate classes: `Animal` and `AnimalActions`.
- `Animal` class stores attributes of an animal (species, age, diet).
- `AnimalActions` class simulates behaviors/actions of an animal (eating, sleeping, making sounds).
- Separation adheres to SRP, with each class having a single responsibility.
- Improves modularity, maintainability, and code quality.
- Changes related to data management or behavior simulation are isolated to their respective classes.

## Conclusion
- Adhering to SRP improves code organization, modularity, and maintainability.
- Separating concerns into distinct classes enhances code reusability and reduces coupling.
- The proposed solution promotes better code design and overall code quality.

---
**Author:** Akshun Chauhan (Ak)

**Date:** 2024-03-21