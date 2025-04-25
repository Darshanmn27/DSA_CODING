# Searching Algorithms Implementation

This repository contains Java implementations of fundamental searching algorithms. The project demonstrates two of the most commonly used searching techniques: Linear Search and Binary Search.

## Table of Contents
- [Overview](#overview)
- [Algorithms Implemented](#algorithms-implemented)
  - [Linear Search](#linear-search)
  - [Binary Search](#binary-search)
- [Time Complexity](#time-complexity)
- [Usage](#usage)
- [Complete Code](#complete-code)
  - [Linear Search Implementation](#linear-search-implementation)
  - [Binary Search Implementation](#binary-search-implementation)

## Overview

This project provides simple and efficient implementations of searching algorithms in Java. Each algorithm is implemented as a separate class with its own method for searching elements in an array.

## Algorithms Implemented

### Linear Search
- Implementation: `Linear_Search.java`
- A simple searching algorithm that checks each element in the array sequentially until a match is found
- Best suited for small datasets or unsorted arrays
- Features:
  - Null array validation
  - Returns index of target element if found
  - Returns -1 if element not found

### Binary Search
- Implementation: `Binary_Search.java`
- An efficient searching algorithm that works on sorted arrays by repeatedly dividing the search interval in half
- Requires the array to be sorted in ascending order
- Features:
  - Null array validation
  - Returns index of target element if found
  - Returns -1 if element not found

## Time Complexity

| Algorithm      | Best Case | Average Case | Worst Case |
|---------------|-----------|--------------|------------|
| Linear Search | O(1)      | O(n)        | O(n)       |
| Binary Search | O(1)      | O(log n)    | O(log n)   |

## Usage

To use these algorithms in your Java project:

1. Clone the repository
2. Compile the Java files:
```bash
javac Linear_Search.java
javac Binary_Search.java
```
3. Run either implementation:
```bash
java Linear_Search
java Binary_Search
```

## Complete Code

### Linear Search Implementation

```java
public class Linear_Search
{
    public static int linear()
    {
        int arr[] = {10, 20, 30, 45, 44, 33, 22, 11, 11, 9, 8, 7, 6, 37, 27};
        int tar = 27;

        if(arr == null || arr.length == 0)
        {
            System.out.println("Array is empty or null");
            return -1;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == tar)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println(linear());
    }
}
```

### Binary Search Implementation

```java
public class Binary_Search 
{
    public static int BS()
    {
        int arr[] = {-20, -10, 0, 3, 5, 8, 12, 18};
        int tar = 12;
        if(arr == null || arr.length == 0)
        {
            System.out.println("array is empty or null");
            return -1;
        }
        int start = 0, end = arr.length-1;

        while (start <= end) 
        {
            int mid = (start + end)/2;

            if(arr[mid] == tar)
            {
                return mid;
            }
            else if(arr[mid] > tar)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println(BS());
    }
}
```

## How the Algorithms Work

### Linear Search Process
1. Iterates through each element in the array sequentially
2. Compares each element with the target value
3. If a match is found, returns the index of that element
4. If no match is found after checking all elements, returns -1
5. Also handles edge cases like null or empty arrays

### Binary Search Process
1. Requires a sorted array as input
2. Finds the middle element of the array
3. If the middle element is the target, returns its index
4. If target is less than middle element, searches in the left half
5. If target is greater than middle element, searches in the right half
6. Repeats steps 2-5 until element is found or search space is exhausted
7. Returns -1 if element is not found
8. Handles edge cases like null or empty arrays

## Output Examples

### Linear Search
- For target = 27, output will be the index where 27 is found in the array
- If target is not in array, output will be -1

### Binary Search
- For target = 12, output will be 6 (index where 12 is located)
- If target is not in array, output will be -1

## Contributing

Feel free to contribute to this project by:
1. Forking the repository
2. Creating your feature branch
3. Committing your changes
4. Pushing to the branch
5. Creating a new Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).