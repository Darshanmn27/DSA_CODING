# 🔄 Array Rotation Algorithms in Java

This repository includes Java implementations of common array rotation problems:

1. **Left Rotate an Array by One Place**
2. **Left Rotate an Array by K Elements**

Each problem is implemented using:
- Brute Force
- Optimal Approaches

---

## 🚀 1. Left Rotate an Array by One Place

### ✅ Problem Statement:
Rotate the given array to the left by **1 position**.

### 📌 Examples:
**Input:** `[10, 20, 12, 27, 34]`  
**Output (Brute):** `20 12 27 34 10`  
**Input:** `[29, 27, 23, 24, 25]`  
**Output (Optimal):** `27 23 24 25 29`

---

### 🧠 Approaches:

#### 🔸 Brute Force:
- Copy elements starting from index 1 to a new array.
- Place the first element at the last index.

---
---
```Java
public class rotateArrayByOnePlace {
    // left rotate the arry by one place
    public static void brute(int arr[], int n) {
        if (arr == null || n == 0) {
            System.out.println("Invalid input  array  is null  or empty.");
            return;
        }
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for (int num : temp) {
            System.out.print(num + " ");
        }
        // time complexity O(n)
        // space complexity O(n)
    }

    public static void optimal(int arr[], int n) {
        if (arr == null || n == 0) {
            System.out.println("Invalid input  array  is null  or empty.");
            return;
        }
        int temp = arr[0];
        System.out.println("\n optimal solution ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // time complexity O(n)
        // space complexity O(1) no extra space is used
        arr[n - 1] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 12, 27, 34 };
        int n = arr.length;
        brute(arr, n);// 20 12 27 34 10
        int arr2[] = { 29, 27, 23, 24, 25 };
        int n2 = arr2.length;
        optimal(arr2, n2);
        // 27 23 24 25 29
    }

}
```
---


**Time Complexity:** O(n)  
**Space Complexity:** O(n)

#### 🔹 Optimal:
- Store the first element.
- Shift all elements one position to the left in the same array.
- Place the first element at the end.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 🚀 2. Left Rotate an Array by K Elements

### ✅ Problem Statement:
Rotate the given array to the left by `k` positions.

### 📌 Example:
**Input:** `[10, 13, 15, 27, 29, 23, 97]`, `k = 4`  
**Output (Optimal):** `29 23 97 10 13 15 27`

---

### 🧠 Approaches:

#### 🔸 Brute Force:
- Create a new array.
- Append elements from index `k` to end, then from start to `k-1`.

---

```Java
public class RotateArrayByK_Elements {
    public static void Brute(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("Invalid input ");
            return;
        }
        k = k % n; // handle k>n
        int temp[] = new int[n];
        int index = 0;
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 27, 26 };
        int n = arr.length;
        int k = 3;
        Brute(arr, n, k);

    }

}
```
---
**Time Complexity:** O(n)  
**Space Complexity:** O(n)

#### 🔹 Better (using `System.arraycopy`):
- Use `System.arraycopy()` to efficiently copy segments.

---
```Java
public class Better {

    public static void rotate(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("Invalid input");
            return;
        }
        k = k % n;
        int temp[] = new int[n];
        System.arraycopy(arr, k, temp, 0, n - k);
        System.arraycopy(arr, 0, temp, n - k, k);

        for (int num : temp) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 27, 89, 37, 65 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);// 89 37 65 10 20 27

    }

}
```
---


**Time Complexity:** O(n)  
**Space Complexity:** O(n)

#### 🔹 Optimal (Reversal Algorithm):
1. Reverse the first `k` elements.
2. Reverse the rest `n-k` elements.
3. Reverse the entire array.

---
```Java
public class Optimal {

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimal(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("invalid input");
            return;
        }
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int arr[] = { 10, 13, 15, 27, 29, 23, 97 };
        int n = arr.length;
        int k = 4;
        optimal(arr, n, k);// 29 23 97 10 13 15 27

    }

}
```

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

