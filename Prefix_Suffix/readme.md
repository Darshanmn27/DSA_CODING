### 📌 Prefix and Suffix Sum Computation in Java

---
### 📘 Problem Description
Given an integer array arr[], compute:

Prefix Sum Array: where each element at index i is the sum of all elements from index 0 to i.

Suffix Sum Array: where each element at index i is the sum of all elements from index i to the last element.

---
 PrefixBrute.java
 ```java
 public class PrefixBrute {

    public static int[] computeprefix(int arr[]) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;

        int prefix[] = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = 0;
            for (int j = 0; j <= i; j++) {
                prefix[i] = prefix[i] + arr[j];
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = computeprefix(arr);
        if (arr == null || arr.length == 0) {
            System.out.println("empty or null  input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }

        }

    }
}
```
---
Time Complexity: O(n²)
Space Complexity: O(n)
---
 PrefixOptimal.java
 ---

public class PrefixOptimal {
    public static int[] optimal(int arr[]) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;

    }

    public static void main(String[] args) {
        int arr[] = { 9, -12, 34, 1, 23, 12 };
        arr = optimal(arr);

        if (arr == null || arr.length == 0) {
            System.out.println("empty or null  input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }

        }
    }

}

```
---
Time Complexity: O(n)
Space Complexity: O(n)
---
### SuffixBrute.java
Logic: For each index, adds up all elements from current to end.

```java
public class SuffixBrute {

    public static int[] computeSuffixBrute(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;
        int suffix[] = new int[n];
        for (int i = 0; i < n; i++) {
            suffix[i] = 0;
            for (int j = i; j < n; j++) {
                suffix[i] = suffix[i] + arr[j];
            }
        }
        return suffix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = computeSuffixBrute(arr);

        if (arr == null || arr.length == 0) {
            System.out.println("empty or null input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

    }

}
```
---
Time Complexity: O(n²)
Space Complexity: O(n)
---
🔹 SuffixOptimal.java
Logic: Uses reverse traversal with a single loop.
---
```java
public class SuffixOptimal {

    public static int[] sufixopti(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = sufixopti(arr);
        if (arr == null || arr.length == 0) {
            System.out.println("empty or null input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

}
```
---
Time Complexity: O(n)
Space Complexity: O(n)
---


