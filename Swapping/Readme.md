# 🔁 Java Program to Swap Two Numbers in Three Ways

## ✅ Problem: Swap Two Numbers
### 💡 What is Swapping?
Swapping refers to the process of exchanging the values of two variables. It's commonly used in algorithms, sorting, and many real-world applications.

### Example:
Before Swapping: num1 = 2027, num2 = 2023 After Swapping: num1 = 2023, num2 = 2027

csharp
Copy code

---

## ✅ Approach 1: Brute Force Solution (Using Temp Variable)
### 💡 Logic:
- Use a third temporary variable to store the value of one of the numbers.
- Then assign the other number to the first variable and the stored value to the second variable.

### 💻 Code: Brute Force Solution
```java
import java.util.Scanner;

public class SwapWithTemp {

    public static void swapping_with_temp() {
        int num1 = 2027;
        int num2 = 2023;
        System.out.println("🔁 Swap using a temporary variable");
        System.out.println("Before Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        // Swapping using temp variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    public static void main(String[] args) {
        swapping_with_temp();
    }
}
✅ Dry Run (For num1 = 2027, num2 = 2023):
yaml
Copy code
Before Swapping:
num1: 2027, num2: 2023
After Swapping:
num1: 2023, num2: 2027
✅ Output:
yaml
Copy code
num1: 2023, num2: 2027
❌ Why Is This Brute Force BAD?
🚩 Inefficient when dealing with large numbers or multiple swaps.

🚩 Time Complexity: O(1)

🚩 Space Complexity: O(1)

✅ Approach 2: Optimized Solution (Without Using Temp)
💡 Logic:
Use arithmetic operations (addition and subtraction) to swap values without the use of an extra variable.

💻 Code: Optimized Solution
java
Copy code
import java.util.Scanner;

public class SwapWithoutTemp {

    public static void swap_without_using_temp() {
        int num1 = 27;
        int num2 = 23;
        System.out.println("🔁 Swap without using a temp variable (arithmetic)");
        System.out.println("Before Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        // Swapping using addition and subtraction
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    public static void main(String[] args) {
        swap_without_using_temp();
    }
}
✅ Dry Run (For num1 = 27, num2 = 23):
yaml
Copy code
Before Swapping:
num1: 27, num2: 23
After Swapping:
num1: 23, num2: 27
✅ Output:
yaml
Copy code
num1: 23, num2: 27
❌ Why Is This Solution Risky?
🚩 Risk of integer overflow with very large numbers.

🚩 Time Complexity: O(1)

🚩 Space Complexity: O(1)

✅ Approach 3: Most Efficient Solution (Using XOR)
💡 Logic:
Use the XOR bitwise operator to swap values efficiently without using extra space or risking overflow.

💻 Code: Efficient XOR Solution
java
Copy code
import java.util.Scanner;

public class SwapUsingXOR {

    public static void swap_using_xor() {
        int num1 = 27;
        int num2 = 23;
        System.out.println("🔁 Swap using XOR bitwise operator");
        System.out.println("Before Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        // Swapping using XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After Swapping:");
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    public static void main(String[] args) {
        swap_using_xor();
    }
}
✅ Dry Run (For num1 = 27, num2 = 23):
yaml
Copy code
Before Swapping:
num1: 27, num2: 23
After Swapping:
num1: 23, num2: 27
✅ Output:
yaml
Copy code
num1: 23, num2: 27
✅ Time & Space Complexity:
Approach	Time Complexity	Space Complexity
XOR Solution	✅ O(1)	✅ O(1)
📂 Conclusion
✅ We explored three different ways to swap two numbers.

✅ The most efficient method is the XOR approach due to its time and space efficiency.

✅ For small numbers, addition/subtraction can also work, but it has the risk of overflow.

✅ Using a temporary variable is the most straightforward, though it uses extra space.



Leap Year Check Program in Java
This Java program demonstrates three different approaches to check if a given year is a Leap Year or not.

Overview
A Leap Year is a year that is divisible by 4, but not divisible by 100 unless it is also divisible by 400.

The program includes three different methods to check if a year is a leap year:

Using if-else condition

Using the ternary operator

Using the Java Date-Time API (LocalDate)

Code Explanation
1. Leap Year Check using if-else
This approach uses the classic leap year formula with if-else conditions.

Condition:

A year is a leap year if:

It is divisible by 4 and not divisible by 100, OR

It is divisible by 400.


public static void leap_year_using_if_else() {
    int year = 100;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println("Given year is a leap year");
    } else {
        System.out.println("Given year is a normal year");
    }
}

2. Leap Year Check using Ternary Operator
This method is a concise version of the first one, where a ternary operator is used to check if the year is a leap year or not.


public static void checkleap_year_using_ternary() {
    System.out.println("Check leap year using the ternary operator:");
    int year = 2024;
    String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "is a Leap Year." : "is not a Leap Year.";
    System.out.println(year + " " + result);
}

3. Leap Year Check using LocalDate (Java Date-Time API)
This method uses the built-in Java LocalDate class from the java.time package to determine if the given year is a leap year.

LocalDate.of(year, 1, 1).isLeapYear() directly checks if the year is a leap year.

public static void check_leap_using_datetimeclass() {
    System.out.println("Using the datetime class.");
    int year = 2024;
    boolean res = LocalDate.of(year, 1, 1).isLeapYear();
    if (res) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
}

# Check if a Number is Even or Odd

This program demonstrates different approaches to check if a given number is even or odd. The following methods are implemented:

- **Using If-Else Statement**
- **Using Ternary Operator**
- **Using Bitwise Operation**

## ✅ Problem Statement

Given a number, the goal is to determine if the number is even or odd.

## 💡 Approaches

### 1. **Using If-Else Statement**

In this approach, we use the modulo operator (`%`) to check if the remainder when divided by 2 is `0` (even) or `1` (odd).

#### Code:
```java
public static void using_if_else() {
    int num = 20285;
    if (num % 2 == 0) {
        System.out.println("even number");
    } else {
        System.out.println("odd number");
    }
}

Time Complexity:
Time Complexity: O(1) (constant time to perform modulus operation and comparison)

Space Complexity: O(1) (constant space usage)

2. Using Ternary Operator
In this approach, we use a one-line ternary operator to check whether the number is even or odd.

public static void using_ternory() {
    System.out.println("using the ternary operator:");
    int num = 2027;
    String result = (num % 2 == 0) ? num + " is an Even number." : num + " is an Odd number.";
    System.out.println(result);
}
Time Complexity:
Time Complexity: O(1) (constant time to perform modulus operation and comparison)

Space Complexity: O(1) (constant space usage for the result string)

3. Using Bitwise Operation
In this approach, we use the bitwise AND operation (&) to check the least significant bit (LSB). If the LSB is 0, the number is even; otherwise, it is odd.


public static void usingbitwise() {
    int num = 3037;
    if ((num & 1) == 0) {
        System.out.println(num + " is an Even number.");
    } else {
        System.out.println(num + " is an Odd number.");
    }
}

✅ Conclusion
In all three approaches:

Time Complexity: O(1)

Space Complexity: O(1)



