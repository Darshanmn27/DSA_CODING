# Filter Words by Character in Java

This repository contains two Java implementations to filter words from a sentence based on the presence of a specified target character.

---

## Problem Statement

Given a sentence (string) and a target character, return all words from the sentence that contain the target character at least once.

Example:

---

## Solutions

### 1. Brute Force Approach

- **Class:** `Brute`
- **Method:** `brutefilter(String str, char tar)`
- **Approach:** 
  - Split the sentence into words.
  - For each word, convert it to a char array.
  - Check every character to see if it matches the target.
  - If found, add the word to the result list and move to the next word.
- **Time Complexity:** O(n * m) where *n* = number of words, *m* = average word length.
- **Space Complexity:** O(k) where *k* = number of matched words.

### 2. Optimal Approach

- **Class:** `Optimal`
- **Method:** `filterwords(String str, char tar)`
- **Approach:**
  - Split the sentence into words.
  - For each word, use built-in `indexOf` method to check if the target character exists.
  - If yes, add the word to the result list.
- **Time Complexity:** O(n * m) (similar to brute force but more concise and uses built-in optimization)
- **Space Complexity:** O(k) where *k* = number of matched words.

---

## Edge Case Handling

- Input sentence is `null` or empty → returns an empty list.
- Input sentence contains multiple spaces → words are split on spaces (can be improved with regex).
- Case sensitivity: the search is case-sensitive.
- Target character not present in any word → returns an empty list.

---

## How to Run

1. Compile the Java file:

```bash
javac Brute.java
javac Optimal.java

---
````java
import java.util.ArrayList;
import java.util.List;

public class Optimal {

    public static List<String> filterwords(String str, char tar) {
        List<String> result = new ArrayList<>();
        if (str == null || str.trim().isEmpty()) {
            return result; // return empty list
        }
        String words[] = str.split(" ");
        for (String word : words) {
            if (word.indexOf(tar) != -1) {
                result.add(word);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String sentence = "darshan good morning today is special day for you";
        char a = 'a';
        System.out.println(filterwords(sentence, a));// [darshan, today, special, day]

    }

}
```

---
```java
import java.util.ArrayList;

public class Brute {

    public static ArrayList<String> brutefilter(String str, char tar) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.trim().isEmpty()) {
            return res; // return empty list
        }
        String words[] = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (c == tar) {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String darhan[]) {
        String sentence = "darshan good morning today is special day for you";
        char a = 'a';
        System.out.println(brutefilter(sentence, a));// [darshan, today, special, day]

    }

}```


