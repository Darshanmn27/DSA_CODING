# 🔢 Count Occurrences in an Array (Java)

This repository demonstrates **three different approaches** to count the number of occurrences of elements in a given array using Java:

1. **Brute-force Approach**
2. **Better Approach (Sorting)**
3. **Optimal Approach (HashMap)**

---

## 🚀 1. Brute-force Approach

### 📌 Description
Uses nested loops and a `visited[]` array to ensure each element is only counted once.

### 🧠 Logic
- For each element, loop through the rest of the array.
- Count duplicates and mark them as visited.

### 📈 Complexity
- **Time:** O(n²)
- **Space:** O(n) — due to the `visited[]` array

### ✅ Example Output

### 📄 Code Snippet
```java
boolean visited[] = new boolean[n];
for (int i = 0; i < n; i++) {
    if (visited[i]) continue;
    int count = 1;
    for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
            visited[j] = true;
            count++;
        }
    }
    System.out.println(arr[i] + "  occurs " + count + " times");
}
```

---
```java
import java.util.Arrays;

public class Better {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 3 };
        Arrays.sort(arr);
        int n = arr.length; // time complexity ==> O(nlogn)--> due to sorting
        int i = 0; // space complexity ==>O(1) (if in place sorting )
        while (i < n) {
            int count = 1;
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            i++;

        }

    }

}
```
🔄 2. Better Approach (Sorting)
📌 Description
Sort the array first, then count consecutive elements.

🧠 Logic
Sort the array.

Traverse using a while loop and count similar adjacent elements.

📈 Complexity
Time: O(n log n) — due to sorting

Space: O(1) — if sorting is done in-place
---
```java
import java.util.HashMap;

public class Optimal {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 1, 1 };
        HashMap<Integer, Integer> hh = new HashMap<>(); // time complexity =O(n)
                                                        // space complexity =O(n)
        for (int num : arr) {
            hh.put(num, hh.getOrDefault(num, 0) + 1);
        }
        for (int key : hh.keySet()) {
            System.out.println(key + " occurs" + hh.get(key) + " times ");
        }

    }

}

```
---
⚡ 3. Optimal Approach (HashMap)
📌 Description
Use a HashMap to store frequencies with O(n) time complexity.

🧠 Logic
Iterate over the array.

Use getOrDefault to count each occurrence.

📈 Complexity
Time: O(n)

Space: O(n)
---

