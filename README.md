# OOP Computing – Java Assignments (CPSC 1181, Langara College)

This repository contains all major Java assignments completed for the course **CPSC 1181 – Object-Oriented Programming** at Langara College.  
Each project demonstrates object-oriented design, algorithmic logic, and clean implementation of Java fundamentals.

---

## Repository Structure

- `assignment1-bitwise-type-limits/`  
  Bitwise logic and primitive type boundaries

- `assignment2a-inheritance-point/`  
  Class inheritance with 2D and 3D point objects

- `assignment2b-irrational-approximations/`  
  Interface implementation of irrational number approximations

- `assignment3-fibonacci-inheritance/`  
  Abstract class and multiple algorithm strategies for Fibonacci numbers

---

## Assignment Summaries

### Assignment 1 – Bitwise Operations and Type Limits

Implements an interactive Java menu to compute the minimum and maximum values of Java primitive types (`byte`, `short`, `int`, `long`) using only bitwise operations.  
Demonstrates binary logic, bitwise shifts, and input-driven control flow.

**Key Concepts:**
- Bitwise operators (`<<`, `~`)
- Procedural menu-based control
- Primitive memory boundaries

---

### Assignment 2A – Inheritance with 2D and 3D Points

Implements a 2D `Point` class and a `Point3D` class that extends it.  
Demonstrates class inheritance, method overloading, overriding, and clean constructor patterns.

**Key Concepts:**
- Class extension (`extends`)
- Overloaded distance methods
- Custom `toString()` output

---

### Assignment 2B – Irrational Approximations via Interface

Defines an `Irrational` interface with methods to approximate:
- π using the Leibniz series
- e using Euler’s sum
- √2 using the Babylonian method

Implements all methods in a concrete class with controlled precision. Tested via a simple driver.

**Key Concepts:**
- Interfaces and implementation
- Mathematical approximations
- Controlled precision with iteration

---

### Assignment 3 – Fibonacci Algorithms Using Inheritance

Extends an abstract `Fibonacci` class with multiple strategies:
- Standard recursion
- Iteration
- Tail recursion
- Memoization with `HashMap`

Includes a benchmark tool that computes Fibonacci values from `n = 2` to `n = 1000` and reports timing and digit length for each algorithm.

**Key Concepts:**
- Abstract classes and method overriding
- BigInteger arithmetic
- Recursion vs. iteration performance
- Memoization
- Timing with `System.currentTimeMillis()`

---

## Technologies Used

- Java 8+
- Eclipse IDE
- JavaFX (GUI in progress)
- OOP design patterns
- Precision math with `BigInteger`
- Console I/O and performance profiling

---

## Author

Alexander Kemos  
Langara College – Computer Science  
Vancouver, BC  

