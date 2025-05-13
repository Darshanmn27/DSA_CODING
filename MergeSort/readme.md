# 🧠 Merge Sort in Java

This repository contains a clean implementation of the **Merge Sort** algorithm in Java using recursion and `ArrayList` for merging subarrays.

---

## 📌 Problem Statement

Sort an array of integers in ascending order using the **Merge Sort** algorithm — a classic Divide and Conquer technique.

---


---

## ✅ Sample Input & Output

### 🔹 Input

```java
import java.util.ArrayList;

public class MergeSortExample {

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;

            }

        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;

        }

        // all the elements temporary array to array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);// left half
        mergeSort(arr, mid + 1, high);// right half
        merge(arr, low, mid, high);// merging sorted halves
    }

    public static void main(String darshan[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        System.out.println("before  sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
```

```java
Before sorting:
5 4 3 2 1

After sorting:
1 2 3 4 5
```
---
### 💡 Algorithm
Divide the array into two halves recursively.

Conquer each half by sorting them.

Combine the two halves into a sorted array using a temporary list.
---

###  Merge Sort Tree Structure (Dry Run)
```java

                     mergeSort([5, 4, 3, 2, 1])
                      /                    \
       mergeSort([5, 4, 3])         mergeSort([2, 1])
           /       \                   /      \
   [5, 4]       [3]           [2]      [1]
    /   \
 [5]   [4]

Then merges:
[5] + [4] → [4,5]  
[4,5] + [3] → [3,4,5]  
[2] + [1] → [1,2]  
[3,4,5] + [1,2] → [1,2,3,4,5]
```


---
### 🕒 Time Complexity
### O(n log n)
---
###  Space Complexity
### O(n)


