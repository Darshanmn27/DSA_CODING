# 📚 Sorting Algorithms in Java

This repository contains the Java implementations of three basic sorting algorithms:

- 🟡 Selection Sort
- 🔵 Bubble Sort
- 🟢 Insertion Sort

Each implementation includes:
- Null or empty array handling
- Clear output before and after sorting
- Inline comments for clarity

---

## 📂 Files

- `selectionSort.java`
- `bubbleSort.java`
- `InsertionSort.java`

---

## 🟡 Selection Sort

**Description:**  
Selection Sort repeatedly selects the minimum element from the unsorted portion and places it at the beginning.

**Time Complexity:**
| Case       | Time      |
|------------|-----------|
| Best       | O(n²)     |
| Average    | O(n²)     |
| Worst      | O(n²)     |

**Space Complexity:** O(1) (in-place sorting)  
**Stable Sort:** ❌ No  
**Use Case:** Small datasets where memory write is costly.


---
```java
public class selectionSort {
    public static void main(String darshan[]) {
        int arr[] = { 27, 1, 2, 3, 4, 1, 2, 3, 4 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }
        System.out.println("Before Sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 27 1 2 3 4 1 2 3 4
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int tem = arr[mini];
            arr[mini] = arr[i];
            arr[i] = tem;
        }
        System.out.println("after sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 1 1 2 2 3 3 4 4 27
        }

    }
}
```
---
---

## 🔵 Bubble Sort

**Description:**  
Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order. It includes an optimization to stop early if no swaps occurred in a pass.

**Time Complexity:**
| Case       | Time      |
|------------|-----------|
| Best       | O(n)      |
| Average    | O(n²)     |
| Worst      | O(n²)     |

**Space Complexity:** O(1)  
**Stable Sort:** ✅ Yes  
**Use Case:** Educational purposes or when data is almost sorted.

---
---
```java
public class bubbleSort {
    public static void main(String[] darshan) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }
        System.out.println("before sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 13 46 24 52 20 9
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 9 13 20 24 46 52
        }

    }

}
```
---
```java
public class InsertionSort {
    public static void main(String[] darshan) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }

        System.out.println("before sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 13 46 24 52 20 9
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 9 13 20 24 46 52
        }

    }

}
```
---


## 🟢 Insertion Sort

**Description:**  
Insertion Sort builds the sorted array one element at a time by placing each element in its correct position.

**Time Complexity:**
| Case       | Time      |
|------------|-----------|
| Best       | O(n)      |
| Average    | O(n²)     |
| Worst      | O(n²)     |

**Space Complexity:** O(1)  
**Stable Sort:** ✅ Yes  
**Use Case:** Small datasets, or arrays that are already nearly sorted.

---

## 🚀 Example Inputs & Outputs

### Selection Sort
**Input:** `27 1 2 3 4 1 2 3 4`  
**Output:** `1 1 2 2 3 3 4 4 27`

---

### Bubble Sort
**Input:** `13 46 24 52 20 9`  
**Output:** `9 13 20 24 46 52`

---

### Insertion Sort
**Input:** `13 46 24 52 20 9`  
**Output:** `9 13 20 24 46 52`

---


