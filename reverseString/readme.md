# 🔁 String Reversal Approaches in Java

This repository demonstrates multiple ways to reverse a **string** and **words in a string** using Java, with clean implementations, edge case handling, and a complexity analysis.

---

## 📂 Files Overview

### 1. `reverseApproach.java`

#### Methods:
- **`reverseUsingLoops(String str)`**  
  Reverses the input string using a manual loop.

  **Time Complexity:** O(n)  
  **Space Complexity:** O(n) — due to the result string being built character by character (string concatenation creates new strings).

- **`usingStringBuilder(String str)`**  
  Uses `StringBuilder`’s built-in `reverse()` method.

  **Time Complexity:** O(n)  
  **Space Complexity:** O(n)

#### Example:
```java
reverseUsingLoops("darshan");       // Output: nahsrad
usingStringBuilder("ZenShan");      // Output: nahSneZ


---


```java
public class reverseApproach {

    public static void reverseUsingLoops(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        System.out.println(res);
    }

    public static void usingStringBuilder(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        StringBuilder rev = new StringBuilder(str);
        System.out.println(rev.reverse().toString());

    }

    public static void main(String args[]) {
        reverseUsingLoops("darshan");// nahsrad
        usingStringBuilder("ZenShan");// nahSneZ

    }
}
```
---
```java
public class reverseDifferent {

    public static void reverseUsingCharacterArray(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        char arr[] = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static String usingRecursion(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }
        return usingRecursion(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        reverseUsingCharacterArray("ZenState");// etatSneZ
        System.out.println("using recursion ");
        System.out.println(usingRecursion("reality"));// ytilaer
    }

}
```
---
```java
public class reverseWordsInString {

    public static String reverseWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        String words[] = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("darshan good  morning"));// morning good darshan

    }

}

```
---