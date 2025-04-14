

## 📌 Problem Statement
Given two integers `a` and `b`, the task is to swap the values of the two integers without affecting any other variables.

You need to solve this problem using **3 different approaches:**
1. **Using a Temporary Variable.**
2. **Without Using a Temporary Variable.**
3. **Using Bitwise XOR Operator.**

You also need to provide the **time complexity (TC)** and **space complexity (SC)** for each approach.

---

## ✅ Approach 1: Using Temporary Variable (Brute Force)

### 💡 Approach Explanation
- In this method, we use a temporary variable (`temp`) to store one of the values.
- We then swap the values using the temporary variable.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:** Constant time and constant space as we are using only one temporary variable.

---

## ✅ Approach 2: Without Using Temporary Variable (Better Approach)

### 💡 Approach Explanation
- In this method, we do not use any temporary variable.
- Instead, we use simple arithmetic operations (addition and subtraction) to swap the values.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:** We only perform **3 arithmetic operations**, so the time complexity is constant.

**Note:** This approach may lead to **integer overflow** in some languages if the sum of `a` and `b` exceeds the integer limit.

---

## ✅ Approach 3: Using Bitwise XOR Operator (Optimal Solution)

### 💡 Approach Explanation
- In this method, we use the bitwise XOR (`^`) operator to swap the numbers.
- XOR has the property that:  
    - `a ^ a = 0`  
    - `a ^ 0 = a`  
    - `a ^ b ^ a = b`
- This property helps us swap two numbers without any temporary variable.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:**
- Bitwise XOR operation takes constant time.
- No extra space is used.
- This approach is highly optimized and is considered the best for swapping two numbers.

---

## ✅ Test Cases
| Test Case No. | Input (a, b) | Expected Output (a, b) |
|----------------|----------------|-----------------------|
| **Test Case 1** | 5, 10            | 10, 5                 |
| **Test Case 2** | -5, 15           | 15, -5                |
| **Test Case 3** | 0, 100           | 100, 0                |
| **Test Case 4** | 25, 25           | 25, 25                |
| **Test Case 5** | Integer.MIN_VALUE, Integer.MAX_VALUE | Integer.MAX_VALUE, Integer.MIN_VALUE |

---

## ✅ Summary
| Approach | Time Complexity | Space Complexity | Notes |
|-----------|----------------|-----------------|-------|
| **Using Temporary Variable** | **O(1)**        | **O(1)**        | Simple but uses extra space.    |
| **Without Using Temporary Variable** | **O(1)** | **O(1)** | May cause integer overflow. |
| **Using Bitwise XOR Operator** | **O(1)**      | **O(1)**      | Most optimized, no extra space. |

---

## 💯 Conclusion
In this problem, you learned **3 different ways** to swap two numbers:
1. ✅ Using a **temporary variable** (traditional method).
2. ✅ Without using a **temporary variable** (by arithmetic operations).
3. ✅ Using **Bitwise XOR Operator** (highly optimized method).

### 💎 Recommendation
👉 Always use the **Bitwise XOR Operator** if you want the **most optimized solution**. 💯🔥
👉 However, if you are in a coding interview, **explain all three methods** to show your in-depth knowledge.

---

## 🚀 Bonus Tip for Interview
💡 **Interviewer may ask:**
> **Why do we use XOR instead of a temporary variable?**

✅ Answer: Using XOR is:
- Highly optimized.
- Does not use extra space.
- Extremely fast in swapping two variables.
- No overflow issues like arithmetic operations.

---


# 🚀 Check Even or Odd Number in Java

This Java program demonstrates **three different approaches** to determine whether a given number is **even** or **odd**:

1. Using `if-else` statement
2. Using `ternary` operator
3. Using **bitwise** operation

---

## 🧠 Problem Statement

Write a program to check whether a given number is even or odd.

> An **even number** is divisible by 2 (i.e., `num % 2 == 0`), otherwise it's **odd**.

---

## 📌 Approaches

### ✅ 1. Using `if-else` Statement

A basic and intuitive approach using conditional statements to check if a number is divisible by 2.

```java
public static void using_if_else() {
    int num = 20285;
    if (num % 2 == 0) {
        System.out.println("even number");
    } else {
        System.out.println("odd number");
    }
}
```
Time Complexity: O(1)

Space Complexity: O(1)

✅ 2. Using Ternary Operator
A more compact version using the ternary operator to determine and print the result in one line.
```
public static void using_ternory() {
    System.out.println("using the ternary operator:");
    int num = 2027;
    String result = (num % 2 == 0) ? num + " is an Even number." : num + " is an Odd number.";
    System.out.println(result);
}
```
Time Complexity: O(1)

Space Complexity: O(1)

✅ 3. Using Bitwise Operator
A clever approach using the bitwise AND & operator. If the least significant bit is 1, the number is odd.
```
public static void usingbitwise() {
    int num = 3037;
    if ((num & 1) == 0) {
        System.out.println(num + " is an Even number.");
    } else {
        System.out.println(num + " is an Odd number.");
    }
}
```
Time Complexity: O(1)

Space Complexity: O(1)

📤 Sample Output
using the ternary operator:
2027 is an Odd number.
3037 is an Odd number.

🧾 Full Code
```
public class Check_even_odd {

    public static void using_if_else() {
        int num = 20285;
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }


    public static void using_ternory() {
        System.out.println("using the ternary operator:");
        int num = 2027;
        String result = (num % 2 == 0) ? num + " is an Even number." : num + " is an Odd number.";
        System.out.println(result);
    }

    public static void usingbitwise() {
        int num = 3037;
        if ((num & 1) == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        using_if_else();
        using_ternory();
        usingbitwise();
    }
}
```
📈 Complexity Analysis
Approach	Time Complexity	Space Complexity
If-Else	O(1)	O(1)
Ternary Operator	O(1)	O(1)
Bitwise Operator	O(1)	O(1)
🙌 Conclusion
All three methods are efficient and run in constant time.

The bitwise approach is the most optimized at the bit level and is often used in low-level systems.

Choose the method based on readability, performance needs, or just for learning fun! ✨


