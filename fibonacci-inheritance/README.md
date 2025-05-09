# Fibonacci Algorithms Using Inheritance (Java)
Course: CPSC 1181 – Object-Oriented Programming, Langara College

This assignment demonstrates multiple Fibonacci calculation strategies implemented through abstract classes, method overriding, and benchmark-driven evaluation.  
A structured menu allows users to test the efficiency of recursion, iteration, tail recursion, and memoization techniques using BigInteger.

---

## Overview

- `Fibonacci.java`: Abstract base class that defines:
  - `usingRecursion(int n)` – implemented directly using standard recursion
  - `usingIteration(int n)` – abstract
  - `usingTailRecursion(int n, BigInteger a, BigInteger b)` – abstract
  - `usingMemoization(int n, HashMap<Integer, BigInteger> cache)` – abstract

- `FibonacciComputation.java`: Concrete subclass that implements:
  - Iterative algorithm using a for loop
  - Tail recursion using accumulator-style arguments
  - Memoization using HashMap to avoid recomputation

- `TestingFibonacci.java`: Interactive benchmark driver that:
  - Presents a menu for selecting the computation method
  - Calculates Fibonacci values for n = 2 to n = 1000
  - Displays number of digits and computation time for each result
  - Handles invalid input and errors gracefully

---

## Class Structure

```text
Fibonacci (abstract)
├─ usingRecursion(int)                   ← implemented
├─ usingIteration(int)                   ← abstract
├─ usingTailRecursion(int, a, b)         ← abstract
└─ usingMemoization(int, cache)          ← abstract

FibonacciComputation extends Fibonacci
├─ usingIteration(int)                   ← overridden
├─ usingTailRecursion(int, a, b)         ← overridden
└─ usingMemoization(int, cache)          ← overridden

TestingFibonacci
└─ main()                                ← menu and performance benchmarking
```

---

## File Contents

- `Fibonacci.java` – Abstract class defining the method structure and base recursion
- `FibonacciComputation.java` – Implements all three performance-oriented methods
- `TestingFibonacci.java` – Console interface and benchmark loop
- `README.md` – Full assignment documentation

---

## Sample Output (n = 1000)

```text
1000    209 digits        0.00 sec (iteration)
1000    209 digits        0.00 sec (tail recursion)
1000    209 digits        0.00 sec (memoization)
```

Note: Recursive method is correct but impractically slow for large n due to exponential time complexity.

---

## Concepts Demonstrated

- Abstract classes and method overriding
- Use of BigInteger for high-precision arithmetic
- Tail recursion vs. standard recursion
- Memoization with HashMap for caching sub-results
- Timing algorithm performance with System.currentTimeMillis()
- Menu-driven user interface and error handling
- Clean modular separation between logic and benchmarking code

---

## Author

Alexander Kemos  
Langara College – Computer Science  
Vancouver, BC  

