# First and Last Index of Target Element in Array

## Problem Description

The task is to find the **first** and **last** index of a given element (target) in a given array of integers. If the element is not found in the array, return `-1,-1`.

## Approach

1. **Input**: An array `arr[]` and an integer `tar` (the target element to search for).
2. **Output**: Return an array of two integers where:
   - The first integer is the index of the first occurrence of the target element.
   - The second integer is the index of the last occurrence of the target element.

   If the element is not found, return `{-1, -1}`.

3. **Logic**:
   - Initialize two variables `first` and `last` as `-1` to store the indices.
   - Loop through the array:
     - If the element matches the target:
       - If `first` is `-1`, it means this is the first occurrence, so update `first`.
       - Update `last` with the current index as the last occurrence.
   - If no target element is found, return `{-1, -1}`.

## Code

```java
public class First_Last
{
    public static int[] firstlast(int arr[], int tar)
    {
        int first = -1, last = -1;
        
        // If the array is null or empty, return {-1, -1}
        if (arr == null || arr.length == 0)
        {
            return new int[]{-1, -1};
        }
        
        // Iterate through the array to find the first and last occurrence
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == tar)
            {
                if (first == -1)
                {
                    first = i; // First occurrence
                }
                last = i; // Last occurrence
            }
        }
        
        // Return the first and last indices
        return new int[]{first, last};
    }
    
    public static void main(String a[])
    {
        // Test case
        int arr[] = {3, 5, 3, 8, 6, 3, 7};
        int tar = 3;
        
        int result[] = firstlast(arr, tar);
        
        // Output the result in "first,last" format
        System.out.println("first and last element in a given array: ");
        System.out.println("{" + result[0] + "," + result[1] + "}"); // {0,5} 
    }
}
```
---
## Example : Element found multiple times

---
```java 
int arr[] = {3, 5, 3, 8, 6, 3, 7};
int tar = 3;
```
---
```java 
first and last element in a given array:
{0,5}
```
---

### Time and Space Complexity
## Time Complexity:
O(n), where n is the length of the array.

The code loops through the array once to find the first and last occurrences of the target.
--- 

 ## Space Complexity:
O(1), constant space.

The algorithm uses a fixed amount of extra space for the first and last variables, regardless of the size of the array.

---
### Conclusion
This Java program efficiently finds the first and last index of a target element in an array, handling edge cases like empty arrays and elements that are not present in the array.

