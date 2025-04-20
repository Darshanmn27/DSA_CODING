# Sliding Window - Maximum Sum Subarray (Java)

This Java program demonstrates the **Sliding Window Technique** to find the **maximum sum of a contiguous subarray** of a given size `k` from an integer array.

---

## 🚀 Problem Statement

Given an integer array and a number `k`, find the maximum sum of a contiguous subarray of size `k`.

---

## ✅ Example

### Input:
``` java

public class Sliding_window {

    public static int findmaxsum(int arr[], int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Window size k is greater than array length.");
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, 3, 4, 5, -1};
        int k = 4;
        int max = findmaxsum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + max);
    }
}
```

---
#### 🧠 Use Cases
Stock price analysis

Maximum revenue over a sliding time window

Sensor data analysis (e.g., temperature, speed)

---
---


### 📚 Concepts Used
Sliding Window Algorithm

Time Complexity: O(n)

Space Complexity: O(1)


---

