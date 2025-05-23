# Isomorphic Strings Checker

## Overview
This repository provides two approaches to check whether two strings are **isomorphic**:
- **Brute-Force Approach** (Uses nested loops)
- **Optimized Approach** (Uses two hash maps for character mapping)

## Problem Statement
Two strings are **isomorphic** if the characters in one string can be replaced to get the other string while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

---
For example:

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false
---

---

## Approach 1: Brute-Force Method 🔥
### Explanation:
- Compares each character pair (`s[i]` and `t[i]`) with all other pairs using **nested loops**.
- Ensures each character mapping remains consistent.
- This method is inefficient for large inputs.

### Implementation:
```java
public class BruteIso {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j)) ||
                    (s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}
```
---
Complexity Analysis:
Time Complexity: O(N²) (Quadratic) – Due to nested loops.

Space Complexity: O(1) – No extra storage used.
---
### Approach 2: Optimized Method 🚀
Explanation:
Uses two hash maps to store character mappings from s → t and t → s.

Ensures bijective mapping (each character maps uniquely).

Efficient and works in linear time.

Implementation:
```java
import java.util.HashMap;

public class OptimalIso {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1) && mapST.get(c1) != c2) return false;
            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) return false;

            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}
```
Complexity Analysis:
Time Complexity: O(N) (Linear) – Iterates through string once.

Space Complexity: O(N) – Two hash maps store mappings.


