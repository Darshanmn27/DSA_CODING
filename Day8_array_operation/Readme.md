# 🔍 Array Maximum and Minimum Element Finder (Java)

This project demonstrates how to find the **maximum** and **minimum** elements in an array using two different approaches:

✅ Brute-force (via Sorting)  
✅ Optimal (via Single Pass)

---

## 🧠 Problem Statement

> Given an array of integers, find the **maximum** and **minimum** elements using both brute-force and optimal approaches.

---

## 📌 Solutions Explained

### 🔧 1. Brute-force Approach
- Sort the array.
- Maximum → last element, Minimum → first element.

#### ✅ Time Complexity
- `O(n log n)` (due to sorting)

#### ✅ Space Complexity
- `O(1)` (in-place sort)

---

### 🚀 2. Optimal Approach
- Traverse the array once.
- Maintain a variable `max` or `min` and update it while traversing.

#### ✅ Time Complexity
- `O(n)`

#### ✅ Space Complexity
- `O(1)`

---

## 📄 Java Code (ArrayMaxMinElement.java)

```java
import java.util.Arrays;

public class ArrayMaxMinElement 
{

    // Brute-force to find maximum using sorting
    public static void maxBruteForce() {
        int[] arr = {-221, -918, -3, -123, -1, -98, -918, 12, 3, 47, 27, 37, 87};
        Arrays.sort(arr); // Time: O(n log n)
        int max = arr[arr.length - 1];
        System.out.println("Maximum element using brute-force: " + max);
    }

    ```
    ---


### Optimal approach to find maximum
```java
    public static void maxOptimal() 
    {
        int[] arr = {-221, -918, -3, -123, -1, -98, -918, 12, 3, 47, 27, 37, 87};
        int max = arr[0];
        for (int num : arr) 
        {
            if (num > max) 
            {
                max = num;
            }
        }
        System.out.println("Maximum element using optimal solution: " + max);
    }
    ```
    ---

    ### Brute-force to find minimum using sorting
    ```java
    public static void minBruteForce() 
    {
        int[] arr = {1, 2, 3, 23, 23, 23, 27, -27, 2027, 9181};
        Arrays.sort(arr); // Time: O(n log n)
        int min = arr[0];
        System.out.println("Minimum element using brute-force: " + min);
    }
    ```
    ---

    ### Optimal approach to find minimum
    ```java
    public static void minOptimal() 
    {
        int[] arr = {1, 2, 3, 23, 23, 23, 27, -27, 2027, 9181};
        int min = Integer.MAX_VALUE;
        for (int num : arr) 
        {
            if (num < min) 
            {
                min = num;
            }
        }
        System.out.println("Minimum element using optimal solution: " + min);
    }
    ```
    ---
    ```java

    public static void main(String[] args) 
    {
        maxBruteForce();
        maxOptimal();
        minBruteForce();
        minOptimal();
    }
}
```
---
###🎯 Key Takeaways
Brute-force is easy to implement but not always efficient.

Optimal solutions save time and are better for large datasets.

Choose the right approach based on the scenario!


