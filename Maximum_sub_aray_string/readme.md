###  Longest Substring Without Repeating Characters
This Java program finds the length of the longest substring without repeating characters from a given string using the Sliding Window technique.

---
📜 Problem Statement
Given a string, find the length of the longest substring that contains no repeated characters.


----

### Approach
Use a HashSet to track unique characters.

Apply a sliding window with two pointers left and i.

When a duplicate character is found, move the left pointer and remove characters from the set until the duplicate is removed.

Keep updating the maximum length of the substring.

---

```Java
import java.util.HashSet;
import java.util.*;

public class Without_repeating
{
    public static int nonrepeating()
    {
        String s = "darshan"; // Input string
        int left = 0, maxlen = 0;
        Set<Character> set = new HashSet<>(); // To store unique characters
        
        for (int i = 0; i < s.length(); i++)
        {
            while (set.contains(s.charAt(i))) 
            {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args)
    {
        System.out.println(nonrepeating()); // Output: 5 ("darsh" or "rshan")
    }
}
```

----

### ⏱️ Time Complexity
### O(N)
Each character is added and removed from the HashSet at most once, where N is the length of the string.

### 💾 Space Complexity
### O(N)
In the worst case (all unique characters), the HashSet stores N characters.


---
### 📚 Concepts Used
HashSet

Sliding Window

Two Pointers

String Manipulation
---


