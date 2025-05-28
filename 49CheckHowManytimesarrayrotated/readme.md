## 📌 Problem Statement

Given a sorted array that has been rotated an unknown number of times, find the number of times it has been rotated.

### Example

```java
Input:  [4, 5, 6, 7, 0, 1, 2]
Output: 4
Explanation: The original sorted array [0, 1, 2, 4, 5, 6, 7] was rotated 4 times.

```
---
✅ Approach 1: Brute Force
🔧 Description
This approach iterates through the entire array to find the minimum element and returns its index.

🧠 Logic
Initialize min as the first element.

Traverse the array.

If an element smaller than min is found, update min and store its index.
```java
public class Brute {
    public static int findRotationCount(int nums[]) {
        int min = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findRotationCount(arr)); // Output: 4
    }
}
```
---
⏱️ Time Complexity
O(n) – where n is the number of elements in the array.

🧠 Space Complexity
O(1) – constant extra space.
---
⚡ Approach 2: Optimal Using Binary Search
🔧 Description
This approach uses binary search to find the index of the minimum element in a rotated sorted array.

🧠 Logic
The minimum element is the only element where the previous element is greater.

Use binary search to narrow down the search space.

If nums[mid] > nums[high], the rotation point lies to the right.

Otherwise, it lies to the left (including mid).
---
```java
public class OptimalusingBinarySearch {

    public static int findrotationcount(int nums[]) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findrotationcount(arr)); // Output: 4
    }
}
```
---
⏱️ Time Complexity
O(log n) – binary search narrows the search range logarithmically.

🧠 Space Complexity
O(1) – constant extra space.