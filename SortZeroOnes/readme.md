# Sort 0s, 1s, and 2s in an Array

This project demonstrates three different approaches to sort an array consisting only of the integers `0`, `1`, and `2`. It includes:

- **Brute Force** using built-in sorting
- **Better Approach** using Counting Sort
- **Optimal Approach** using the Dutch National Flag Algorithm (Three Pointers)

---

## 📌 Problem Statement

Given an array containing only `0`, `1`, and `2`, sort the array in-place without using any sorting library (except in Brute force). The goal is to sort it with optimal time and space complexity.

---

## 🧪 Sample Input

Input: [1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 2]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2]

---

## ✅ Approaches

### 1. 🚀 Brute Force (Using Arrays.sort())

- **Description**: Uses Java’s built-in `Arrays.sort()` method.
- **Code**: `Brute.java`
- **Time Complexity**: `O(n log n)`
- **Space Complexity**: `O(1)` (In-place for primitive arrays)
- **Usage**:
  ```java
  Arrays.sort(arr);

```
---
2. ⚙️ Better Approach (Counting Sort)
Description: Counts the number of 0s, 1s, and 2s, then overwrites the array accordingly.

Code: Better.java

Time Complexity: O(n)

Space Complexity: O(1)

Steps:

Count number of 0s, 1s, and 2s.

Fill the array sequentially with those counts.
---
```java
public class Better {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 2 };
        if (arr == null || arr.length == 0) {
            System.out.println("Array  is null  or empty.");
            return;
        }
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        int index = 0;

        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
```

---
3. 🧠 Optimal Approach (Dutch National Flag Algorithm)
Description: Uses three pointers (low, mid, high) to sort the array in a single traversal.

Code: OptimalDutchNationalFlag.java

Time Complexity: O(n)

Space Complexity: O(1)

Steps:

Traverse with a mid pointer.

Swap elements according to value and maintain partitions of 0s, 1s, and 2s using low and high pointers.
---
```java
import java.util.ArrayList;
import java.util.Arrays;

public class OptimalDucthNationalFlag {

    public static void sortedarry(ArrayList<Integer> aa, int n) {
        int low = 0, mid = 0, high = n - 1;// 3 pointers
        while (mid <= high) {
            if (aa.get(mid) == 0) {
                int temp = aa.get(low);
                aa.set(low, aa.get(mid));
                aa.set(mid, temp);
                low++;
                mid++;
            } else if (aa.get(mid) == 1) {
                mid++;
            } else {
                int temp = aa.get(mid);
                aa.set(mid, aa.get(high));
                aa.set(high, temp);
                high--;
            }

        }

    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> aa = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
        sortedarry(aa, n);
        System.out.println("after sorting ");
        for (int num : aa) {
            System.out.print(num + " ");
        }

    }

}
```
