###  Searching in a Rotated Sorted Array — solved in Java using both Brute Force and Optimal (Binary Search) approaches.

```java
public class Brute {

    public static int bruteSearch(int arr[], int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String darshan[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int ans = bruteSearch(arr, target);
        System.out.println(ans);
        /*
         * time complexity ==> O(n)
         * space complexity ==> O(1)
         * 
         */

    }
}```

---
### 🔁 Brute Force Approach
Idea: Traverse the array linearly.
⏱️ Time: O(n)
📦 Space: O(1)
✅ Simple, but inefficient for large arrays.
----


---
```java
public class Optimal {

    public static int OptimalusingBS(int arr[], int tar) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= tar && tar < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < tar && tar <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int ans = OptimalusingBS(arr, target);
        System.out.println(ans);// 4
        /*
         * time complexity ==> O(log n)
         * Space complexity ==> O(1)
         */

    }

}
```
---
### ⚡ Optimal Approach (Modified Binary Search)
Idea: Use binary search with logic to handle rotated halves.
⏱️ Time: O(log n)
📦 Space: O(1)
✅ Best choice for sorted & rotated arrays.
---

