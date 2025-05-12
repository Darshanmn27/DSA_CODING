# Ugly Number Checker in Java

This repository contains two Java implementations for checking whether a given number is an **Ugly Number**.

An **Ugly Number** is a positive number whose prime factors only include **2, 3, and 5**.

---

## 🔢 What is an Ugly Number?

A number is called *ugly* if its only prime factors are **2**, **3**, or **5**.  
- **Examples of Ugly Numbers:** 1, 2, 3, 5, 6, 8, 10, 12, 15, 30, 90  
- **Non-Ugly Numbers:** 7, 14, 19, 28 (they contain other prime factors like 7, 19, etc.)

---

## ✅ Implementations

### 1. `Ugly.java` - Array-based Factor Removal

Uses a loop over the array `{2, 3, 5}` and removes those factors from the number.

```java
public class Ugly {

    public static boolean isUgly(int num) {
        if (num <= 0) return false;
        int factors[] = {2, 3, 5};
        for (int fact : factors) {
            while (num % fact == 0) {
                num = num / fact;
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(90)); // true
        System.out.println(isUgly(45)); // true
        System.out.println(isUgly(38)); // false
    }
}
```
### 2. UglyNumber.java - Hardcoded While Loops
```java
public class UglyNumber {

    public static boolean isUglyNumber(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num = num / 2;
        while (num % 3 == 0) num = num / 3;
        while (num % 5 == 0) num = num / 5;
        return num == 1;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 30;
        System.out.println(isUglyNumber(num1)); // true
        System.out.println(isUglyNumber(num2)); // true
        System.out.println(isUglyNumber(28));   // false
    }
}
```
