# Brute Force Maximum Sum Contiguous Subarray

This Java program implements a brute-force approach to find the maximum sum of any contiguous subarray from a given array of integers.

## Problem Statement

Given an integer array `arr[]`, the goal is to find the contiguous subarray (containing at least one number) which has the largest sum and return that sum.

## Approach

The brute-force approach involves the following steps:
1. Iterate over all possible subarrays of the given array.
2. For each subarray, calculate the sum of its elements.
3. Track the maximum sum encountered during the iterations.

The method uses three nested loops:
- The outer loop picks the starting index of the subarray.
- The second loop picks the ending index of the subarray.
- The innermost loop calculates the sum of elements between the starting and ending index of the subarray.

If the sum of a subarray is greater than the current maximum sum, the program updates the maximum sum.

## Code Implementation

```java
public class Brute_force {

    public static void maximum_sum_contiguous_subarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;

        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("array must not be null or empty");
            return;
        }

        // Iterate through all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                maxsum = Math.max(maxsum, sum);  // Update maxsum if a higher sum is found
            }
        }
        System.out.println("Maximum sum :" + maxsum);  // Output the maximum sum
    }

    public static void main(String args[]) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maximum_sum_contiguous_subarray(arr);  // Call the method with the array
    }
}
```

---


# Maximum Sum of Contiguous Subarray (Better Approach)

This is a Java implementation of the **maximum sum of a contiguous subarray** problem using a "Better Approach" with a brute-force solution. The algorithm calculates the maximum sum of contiguous subarrays and prints the result.

## Problem Overview

Given an array of integers (positive and negative), the goal is to find the sum of the contiguous subarray that has the largest sum. 

### Example:
For the input array:

---
### [-2, 1, -3, 4, -1, 2, 1, -5, 4]
---



The maximum sum of a contiguous subarray is `6` for the subarray `[4, -1, 2, 1]`.

## Features

- **Handles null or empty arrays:** The function checks if the array is `null` or empty before processing to prevent errors.
- **Simple Brute-Force Algorithm:** It calculates the sum of every possible contiguous subarray and keeps track of the maximum sum found.

## Code Explanation

### Function: `better_approach_subarray(int[] arr)`

1. **Input:** A single integer array `arr[]` that contains both negative and positive numbers.
2. **Output:** Prints the maximum sum of any contiguous subarray.

### Steps:
1. The method initializes `maxsum` to `Integer.MIN_VALUE` to store the highest sum encountered.
2. It checks if the input array is null or empty. If true, it prints a message and exits.
3. It uses two nested loops to go through each possible subarray:
   - The outer loop fixes the start of the subarray.
   - The inner loop extends the subarray and calculates the sum.
4. The maximum sum is updated during each iteration.
5. Finally, it prints the maximum sum found.

### Main Method

- Initializes a test array `arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}`.
- Calls the `better_approach_subarray()` method to compute and print the result.

## Time and Space Complexity

- **Time Complexity:** O(n²) – Due to the nested loops, we check each possible subarray.
- **Space Complexity:** O(1) – No extra space is used apart from the input array.

## Example

### Input:
``` java
arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
```




----
## Code Implementation

```java
public class Better 
{
    public  static  void better_approach_subarray(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;

        if(arr==null||arr.length==0)
        {
            System.out.println("array  must  not  be null  or  empty");
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println("maximum  sum :"+maxsum);


    }

    public  static  void  main(String  args[])
    {
      int arr[]=  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      better_approach_subarray(arr);


    }
    
}

```

----

# Maximum Sum Contiguous Subarray - Kadane's Algorithm

## Description

This program finds the maximum sum of a contiguous subarray within a given array of integers using **Kadane's Algorithm**. The algorithm is optimal with a time complexity of **O(n)** and a space complexity of **O(1)**, making it the best solution for this problem in terms of both time and space efficiency.

## Problem Statement

Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

### Example:
For an input array: `{-2, 1, -3, 4, -1, 2, 1, -5, 4}`, the output should be:

----



----

The contiguous subarray `[4, -1, 2, 1]` has the largest sum of 6.

## Code Explanation

### **Kadane's Algorithm**:

1. **Edge Case Handling**: If the array is `null` or empty, the program prints a message and terminates.
   
2. **Initialization**:
   - `maxSum`: Stores the maximum sum encountered so far, initialized to the first element of the array.
   - `currentSum`: Tracks the current sum of the subarray, initialized to the first element.

3. **Loop**:
   - Traverse the array starting from the second element.
   - For each element, decide whether to include it in the current subarray or start a new subarray. This is done using:
     ```java
     currentSum = Math.max(arr[i], currentSum + arr[i]);
     ```
   - Update `maxSum` if `currentSum` is greater.

4. **Output**:
   - After processing all elements, print the maximum sum of the contiguous subarray.

## Code

```java
public class Optimal_subarray {

    // Function to find the maximum sum of a contiguous subarray using Kadane's Algorithm
    public static void using_kadens_algorithm(int arr[]) {
        // Edge case: If the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array must not be null or empty");
            return;
        }

        // Initialize the max sum and current sum with the first element of the array
        int maxSum = arr[0];    // To store the maximum sum encountered so far
        int currentSum = arr[0]; // To store the current subarray sum

        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update the current sum to either the current element itself
            // or the sum of the current element and the previous subarray sum
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update the max sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Output the maximum sum of contiguous subarray
        System.out.println("Maximum sum of contiguous subarray: " + maxSum);
    }

    public static void main(String[] args) {
        // Example input array
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Calling the function to find the maximum sum subarray
        using_kadens_algorithm(arr);
    }
}

```


### Time and Space Complexity
Time Complexity: O(n), where n is the length of the array. We only make a single pass over the array.

Space Complexity: O(1), as we are using only a constant amount of extra space (the variables maxSum and currentSum).

Edge Cases Handled
Empty or Null Array: If the array is null or empty, a message is printed, and the function returns immediately.

All Negative Numbers: The algorithm works correctly even if the array contains all negative numbers, returning the maximum single negative number as the sum.

