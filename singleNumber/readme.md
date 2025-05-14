### 🧠 Problem: Single Number II
Given a non-empty integer array where every element appears three times except one, which appears exactly once. Find that single one.

```java
Input:  [20, 27, 23, 20, 23, 20, 23]
Output: 27
Explanation: All numbers appear 3 times except 27.
```
### 🔍 Approaches
💡 1. Brute Force – HashMap Frequency Counter
🔗 File: singleBrute.java
✅ Logic
Traverse the array and count the frequency of each number using a HashMap.

Return the number whose frequency is exactly 1.

🕒 Time Complexity
O(n) for traversing the array

O(n) for iterating over the map entries
➡ Total: O(n)

🧠 Space Complexity
O(n) for the HashMap to store element frequencies
---
```java
import java.util.HashMap;
import java.util.Map;

public class singleBrute {

    public static int singleNumber(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is null or length is 0");
            return -1;
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        System.out.println("element  not  found ");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 23, 2027, 2027, 2027, 23, 27, 12, 12, 12 };
        int res = singleNumber(arr);
        System.out.println(res);// 27

    }
}
```
---
### ⚡ 2. Optimal – Bitwise Manipulation (Constant Space)
🔗 File: optimalSingle.java
✅ Logic
Use two variables:

ones: stores bits that appear once

twos: stores bits that appear twice

Any bit that appears three times gets cleared from both.

🕒 Time Complexity
O(n) – Single pass through the array

🧠 Space Complexity
O(1) – Constant extra space (no additional data structures)
---
``java
public class optimalSingle {

    public static int singleNumber(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input  array  must  not  be  null or  empty ");
        }
        int ones = 0, twos = 0;
        for (int num : arr) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;

    }

    public static void main(String[] args) {
        int arr[] = { 20, 27, 23, 20, 23, 20, 23 };
        int res = singleNumber(arr);
        System.out.println(res);// 27

    }

}
```

---
📦 Edge Case Handling
Both solutions check:

✅ Null array

✅ Empty array

✅ All elements appear 3 times except one

❌ Multiple single numbers (undefined behavior)

---

