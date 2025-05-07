# 🔍 Common Prefix and Suffix Finder in Java

This project contains two Java programs:

1. `CommonPrefix.java` – Finds the **longest common prefix** among a list of strings.
2. `CommonSuffix.java` – Finds the **longest common suffix** among a list of strings.
---

## 📌 Problem Description

Given an array of strings, the goal is to find:

- The **longest prefix** common to all strings in the array.
- The **longest suffix** common to all strings in the array.

If no such prefix/suffix exists, the program should print an appropriate message.

---

## 🚀 How It Works

### ✅ CommonPrefix.java

- Takes the first string as the base prefix.
- Iterates over the array and trims the prefix from the **end** until it matches the start of the current string.

### ✅ CommonSuffix.java

- Takes the first string as the base suffix.
- Iterates over the array and trims the suffix from the **beginning** until it matches the end of the current string.

---

###

```java
public class CommonPrefix {
    public static void main(String darshan[]) {

        String arr[] = { "darshan", "darshanmn", "darshandeveloper", "darshancoder" };
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is null or empty");
            return;
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Null string found in array");
                return;

            }
            while (!arr[i].startsWith(prefix)) {
                if (prefix.isEmpty()) {
                    System.out.println("No common prefix ");
                    return;

                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}
```


---
```java
public class CommonSuffix {

    public static void main(String[] args) {

        String arr[] = { "darshan2027", "darshanmn2027", "darshandeveloper2027", "darshancoder2027" };
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is null or empty");
            return;
        }
        String suffix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Null string found in array");
                return;

            }
            while (!arr[i].endsWith(suffix)) {
                if (suffix.isEmpty()) {
                    System.out.println("no common suffix ");
                    return;

                }
                suffix = suffix.substring(1);
            }
        }
        System.out.println(suffix);
    }

}
```

✅ CommonPrefix
Time Complexity: O(N * M)

N = number of strings

M = length of the shortest string

Space Complexity: O(1)

Only one variable (prefix) is used for tracking the common prefix.

✅ CommonSuffix
Time Complexity: O(N * M)

Similar to prefix logic, but trims from the start.

Space Complexity: O(1)

Only one variable (suffix) is used for tracking the common suffix.
---



