# Irrational Number Approximations via Interface (Java)
*Course: CPSC 1181 – Object-Oriented Programming, Langara College*

This assignment demonstrates the use of **interfaces**, **mathematical approximation algorithms**, 
and clean Java design by implementing an `Irrational` interface with methods to estimate π (pi), 
e (Euler's constant), and √2 using custom formulas.

---

## Overview

- Implements an `Irrational` interface with three method contracts:
  - `computePI(int precision)` – using the **Leibniz formula**
  - `computeEulerConstant(int precision)` – using **Euler's series**
  - `computeSquareRootOfTwo(int precision)` – using the **Babylonian method**

- Implements these methods in `IrrationalApproximation.java` using iterative logic

- Tested via `TestIrrational.java`, which calls each method with large precision values to demonstrate accuracy

---

## Class & Interface Structure

```text
Irrational (interface)
├─ computePI(int)
├─ computeEulerConstant(int)
└─ computeSquareRootOfTwo(int)

IrrationalApproximation implements Irrational
├─ computePI(int)                 ← Leibniz formula
├─ computeEulerConstant(int)     ← Euler series
└─ computeSquareRootOfTwo(int)   ← Babylonian method

TestIrrational (driver class)
└─ main()                         ← Calls and prints all three approximations
