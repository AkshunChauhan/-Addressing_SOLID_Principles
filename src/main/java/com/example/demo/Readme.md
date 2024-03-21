# Single Responsibility Principle (SRP) Violation and Solution

## Introduction SRP
The Single Responsibility Principle (SRP) is a fundamental principle of object-oriented design that emphasizes that a class should have only one reason to change.

## Violation of SRP
- The `Animal` class in the codebase is responsible for both storing attributes of an animal and simulating behaviors/actions.
- This violates SRP as the class has multiple reasons to change, reducing modularity and maintainability.
- Modifications related to attributes or behaviors require changes in the same class, leading to coupling of responsibilities.

## Proposed Solution
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

