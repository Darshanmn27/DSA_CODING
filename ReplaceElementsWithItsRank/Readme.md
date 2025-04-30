# Element Ranking Algorithm

## Overview
This project implements two algorithms for ranking elements in an array of integers. 
The methods include a brute force approach using HashSet and a more efficient TreeSet approach. 
The goal is to convert an array of integers into their respective ranks while handling duplicates.

## Features
- **Brute Force Approach:** Utilizes HashSet for unique element extraction and sorting.
- **TreeSet Approach:** Employs TreeSet for automatic sorting and uniqueness.
- Handles null and empty array cases gracefully.

---
java Brute
```java
import java.util.*;

public class Brute {

    public static int[] replaceitsRankBrute(int arr[]) {
        if (arr == null) {
            System.out.println("input  array  is null.");
            return null;
        }
        if (arr.length == 0) {
            System.out.println("array  is  empty");
            return new int[0];
        }

        // extract unique elements using hashset
        Set<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        // convert hashset to list and sort it
        List<Integer> sorted = new ArrayList<>(unique);
        Collections.sort(sorted);
        // assign ranks using a hashmap
        Map<Integer, Integer> hh = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            hh.put(num, rank++);
        }

        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = hh.get(arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 40, 10, 20, 30, 20 };
        arr = replaceitsRankBrute(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // out put ==> 4 1 2 3 2

    }
}
```

---
### java ApproachUsingTreeSet
---
```java
import java.util.*;

public class ApproachUsingTreeSet {

    public static int[] TreesetApproach(int arr[]) {
        if (arr == null) {
            System.out.println("input array  is null");
            return null;
        }
        if (arr.length == 0) {
            System.out.println("array  is  empty");
            return new int[0];
        }
        // treeset to get unique elements in a sorted order
        Set<Integer> sorted = new TreeSet<>();
        for (int num : arr) {
            sorted.add(num);
        }

        // assign ranks using a hashmap

        Map<Integer, Integer> rank = new HashMap<>();
        int ran = 1;
        for (int num : sorted) {
            rank.put(num, ran++);
        }

        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rank.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30, 20 };
        arr = TreesetApproach(arr);
        System.out.println("  ranked  output ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
```
---

## Time and Space Complexity

### Brute Force Approach
- Time Complexity: O(n log n) due to sorting of unique elements.
- Space Complexity: O(n) for storing unique elements and ranks.

### TreeSet Approach
- Time Complexity: O(n log n) for adding elements to TreeSet.
- Space Complexity: O(n) for storing unique elements and ranks.
