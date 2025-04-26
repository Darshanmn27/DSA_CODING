# Anagram Checker

This Java application checks if two given strings are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of another, using all the original letters exactly once.

## Features

- Checks for anagrams by comparing sorted character arrays.
- Handles null inputs.
- Returns a boolean result indicating whether the given strings are anagrams.

## How It Works

The program follows these steps:
1. It checks if any of the input strings are `null`. If so, it returns `false`.
2. It compares the lengths of the two strings. If they are not equal, it returns `false`.
3. The strings are converted into character arrays and sorted.
4. Finally, it checks if the sorted arrays are equal to determine if the strings are anagrams.

## Code Structure

### Main Class

```java
public class Check_Anagram {
    public static boolean anagramornot(String s1, String s2) {
        // Implementation
    }

    public static void main(String abc[]) {
        // Test example
    }
}

```
Method Explanation

---
### anagramornot(String s1, String s2): Checks if the strings s1 and s2 are anagrams.
main(String[] args): Contains a test case where the strings "triangle" and "integral" are checked for being anagrams.
Example Usage
To run the program, simply compile and execute the Check_Anagram class. The output will indicate if the specified strings are anagrams.
###
Sample Output
For the input strings "triangle" and "integral":
---

### triangle and integral are anagram
