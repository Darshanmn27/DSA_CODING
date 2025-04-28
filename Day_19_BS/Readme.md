# Java Algorithms for Ceiling and Floor Functions

## Overview

This project contains Java implementations of various algorithms to find the ceiling and floor of a given target value within a sorted array. The algorithms are structured into separate classes, each targeting different methods of searching: brute-force and optimal (binary search).

## Table of Contents

- [Classes Overview](#classes-overview)
- [Code Implementation](#code-implementation)
- [Time and Space Complexity](#time-and-space-complexity)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Classes Overview

1. **BruteCeil**: Brute-force approach to find the ceiling of a target value.
2. **CeilOptimal**: Optimal approach using binary search to find the ceiling.
3. **FloorBrute**: Brute-force approach to find the floor of a target value.
4. **LinearLowerBound**: Linear search to find the lower bound index for a target value.
5. **OptimalFloor**: Binary search to find the optimal floor of a target value.
6. **OptimalLowerBound**: Binary search for finding the optimal lower bound index.
7. **OptimalUpperBound**: Binary search for finding the optimal upper bound index.
8. **UpperBound**: Brute-force for upper bound index calculation.

## Code Implementation

### BruteCeil
```java
public class BruteCeil {
    public static int bruteCeil() {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int tar = 49;

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int ceil = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= tar) {
                ceil = arr[i]; //change made here
                break;
            }
        }

        if (ceil == Integer.MAX_VALUE) {
            System.out.println("not found ceil");
            return -1;
        }

        return ceil;
    }

    public static void main(String[] args) {
        System.out.println(bruteCeil());
    }
}

```
---
// Time Complexity: O(n)
// Space Complexity: O(1)
CeilOptimal
```java
public class CeilOptimal {
    public static int findCeilOptimal() {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int tar = 49;

        if (arr == null || arr.length == 0) {
            System.out.println("array occur null or 0 size");
            return -1;
        }

        int start = 0, end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= tar) {
                ans = arr[mid]; //change made here
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println("no ceil is found, return -1");
            return -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findCeilOptimal());
    }
}
```
// Time Complexity: O(log n)
// Space Complexity: O(1)
Repeat similar structure for the other classes...

Time and Space Complexity
BruteCeil:

Time Complexity: O(n)
Space Complexity: O(1)
CeilOptimal:

Time Complexity: O(log n)
Space Complexity: O(1)
FloorBrute:

Time Complexity: O(n)
Space Complexity: O(1)
LinearLowerBound:

Time Complexity: O(n)
Space Complexity: O(1)
OptimalFloor:

Time Complexity: O(log n)
Space Complexity: O(1)
OptimalLowerBound:

Time Complexity: O(log n)
Space Complexity: O(1)
OptimalUpperBound:

Time Complexity: O(log n)
Space Complexity: O(1)
UpperBound:

Time Complexity: O(n)
Space Complexity: O(1)

