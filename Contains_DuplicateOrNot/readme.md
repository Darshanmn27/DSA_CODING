# 🔍 Contains Duplicate - Java Solutions

This repository contains three Java implementations to check whether a given array contains any duplicate elements:

1. **Brute Force Approach**
2. **Better Approach using HashSet**
3. **Optimal Approach using Sorting**

---

## ✅ Problem Statement

Given an integer array, determine if it contains any duplicates.  
Return `true` if any value appears at least twice, and `false` if every element is distinct.

---

## 🧠 1. Brute Force Approach

### 📄 Code: `bruteForceApproach.java`
```java
public class bruteForceApproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println(containsDuplicate(arr)); // true
    }
}
```
### ⏱ Time Complexity: O(n^2)
### 🗂 Space Complexity: O(1)

---
### 2. Better Approach using HashSet
---
```java
import java.util.HashSet;

public class BetterApproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4};
        System.out.println(containsDuplicate(arr)); // true
    }
}
```
### ⏱ Time Complexity: O(n)
### 🗂 Space Complexity: O(n)
---
###🧩 3. Optimal Approach using Sorting
```java
import java.util.Arrays;

public class OptimalApproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(arr)); // true
    }
}
```
### ⏱ Time Complexity: O(n log n)
### 🗂 Space Complexity: O(1) (if in-place sort is allowed)

---
📌 Conclusion
Choose the approach based on:
---
Speed ➜ Use HashSet
---

Memory ➜ Use Sorting
---
Very small inputs ➜ Brute Force is acceptable

