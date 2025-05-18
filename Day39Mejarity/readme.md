# 🧠 Majority Element II – LeetCode Problem 229

## 🚀 Problem Statement

Given an integer array of size `n`, find all elements that appear more than `⌊ n/3 ⌋` times.

---

## 🔗 LeetCode Link

**Problem**: [Majority Element II (LeetCode 229)](https://leetcode.com/problems/majority-element-ii)

---

## ✅ Approach 1: Brute Force

### 🔍 Idea

- For every element, count how many times it appears in the array.
- Only add the element to the result if it appears more than `n / 3` times and hasn’t already been added.

### 💻 Code

```java
import java.util.*;

public class Brute {

    public static List<Integer> mejarityElement(int arr[]) {
        int n = arr.length;
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            // Avoid duplicates
            if (!ls.contains(arr[i])) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    ls.add(arr[i]);
                }
            }
        }

        return ls;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(mejarityElement(arr)); // Output: [1, 2]
    }
}
```
🕒 Time Complexity
O(n²) — Nested loops for frequency counting

💾 Space Complexity
O(1) (excluding output list)

---

✅ Approach 2: HashMap (Better)
🔍 Idea
Count frequencies using a HashMap.

Iterate through the map and add numbers to the result if their frequency is greater than n / 3.


---
```java
import java.util.*;

public class usingMap {

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n / 3;

        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 27, 27, 27 };
        System.out.println(majorityElement(arr)); // Output: [1, 27]
    }
}
```
### 🕒 Time Complexity
O(n) — One pass to count, one pass to collect results

💾 Space Complexity
O(n) — For the HashMap

