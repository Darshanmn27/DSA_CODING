# Java String Manipulation Demonstration

This repository contains three Java classes showcasing different ways to perform **String manipulation** using:
- `String`
- `StringBuilder`
- `StringBuffer`

These examples are useful for understanding how to work with immutable and mutable strings in Java, and to explore important string operations.

---

## 📁 Classes Overview

### 1. `MANIPULATION.java`

This class demonstrates various common operations on `String` (immutable) in Java. It is divided into multiple methods:

#### 🔹 `simpleMethods()`
Basic operations on a `String` object:
- `length()`
- `toLowerCase()`, `toUpperCase()`
- `charAt()`
- `codePointAt()`
- `indexOf()`, `lastIndexOf()`
- `contains()`





---
---

---
```java
public class MANIPULATION {

    public static void simpleMethods() {
        String s1 = new String("DARshan");
        System.out.println(s1.length());// 7
        System.out.println(s1.toLowerCase());// darshan
        System.out.println(s1.toUpperCase());// DARSHAN
        System.out.println(s1.charAt(4));// h
        System.out.println(s1.codePointAt(0));// 68 unicode value of D
        System.out.println(s1.codePointAt(1));// 65 unicode value of A
        System.out.println(s1.indexOf('A'));// 1
        System.out.println(s1.lastIndexOf('a'));// 5
        System.out.println(s1.contains("arshan"));// false
    }

    public static void manipulate() {
        System.out.println("  string manipulation");
        String s = "darshan GOOD Morning";
        System.out.println(s.indexOf('a'));// 1
        System.out.println(s.lastIndexOf('a'));// 5
        System.out.println(s.contains("Morning"));// true
        System.out.println(s.contains("good"));// false
        System.out.println(s.isEmpty());// false
        String str = new String("");
        System.out.println(str.isEmpty());// true
        System.out.println(s.endsWith("Morning"));// true
        System.out.println(s.startsWith("darshan"));// true
        System.out.println(s.substring(5));// an GOOD Morning
    }

    public static void manipulate3() {
        System.out.println("string manipulation ");
        String s = new String("darshan good morning");
        System.out.println(s.substring(13));// morning
        System.out.println(s.substring(8, 12));// good
    }

    public static void manipulate4() {
        String s = new String("JAVA,PYTHON,SWIFT");
        System.out.println("hello darshan good  morning ");
        String arr[] = s.split(",");
        for (String aa : arr) {// JAVA PYTHON SWIFT
            System.out.print(aa + " ");
        }
    }

    public static void manipulation() {
        System.out.println("string manipulation ");
        String s = new String("darshan");
        char arr[] = s.toCharArray();
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        // d a r s h a n
        System.out.println();
        System.out.println(arr[0]);// d

    }

    public static void main(String args[]) {
        simpleMethods();
        manipulate();
        manipulate3();
        manipulate4();
        manipulation();

    }
}
```
---
```java
public class builders {

    public static void manipulate1() {
        System.out.println("builder manipulation");
        StringBuilder st = new StringBuilder();
        System.out.println(st.capacity());// 16
        st.append("darshan");// adds 7 characters
        System.out.println(st);// darshan
        st.append("good morning ");// adds 13 characters ==> total 20 characters
        System.out.println(st);// darshangood morning
        System.out.println(st.capacity());// 34
        st.delete(0, 7);// deletes characters from index 0 to 6 ("darshan")
        System.out.println(st);// good morning
    }

    public static void main(String[] args) {

        manipulate1();
    }

}
```
---
```java
public class buffer {

    public static void simplebuffer() {
        // chengable string
        StringBuffer st = new StringBuffer();
        System.out.println(st.capacity());// 16 default capacity
        st.append("darshan");
        System.out.println(st);// darshan
        st.append("welcome");
        System.out.println(st);// darshanwelcome
        st.append("gosling");
        System.out.println(st);// darshanwelcomegosling
        System.out.println(st.capacity());// 34
        // capacity==> current_capacity*2+2= 16*2+2=34 // it only grows when needed.
        st.delete(0, 7);// Deletes characters from index 0 to 6
        System.out.println(st);// welcomegosling
    }

    public static void main(String[] args) {
        simplebuffer();// 16

    }

}
```



#### 🔹 `manipulate()`
- Checks for substring presence (`contains`)
- Index finding
- Checking if a string is empty
- Validating prefix (`startsWith`) and suffix (`endsWith`)
- Extracting substrings using `substring(startIndex)`

#### 🔹 `manipulate3()`
- More advanced use of `substring(startIndex, endIndex)`

#### 🔹 `manipulate4()`
- Splitting a `String` using `split(",")` into an array

#### 🔹 `manipulation()`
- Converts string to character array using `toCharArray()`
- Prints each character individually

---

### 2. `builders.java`

This class demonstrates manipulation using `StringBuilder`, a mutable version of strings optimized for single-threaded applications.

#### 🔹 `manipulate1()`
- Default capacity check
- Appending multiple strings
- Capacity growth rule: `newCapacity = oldCapacity * 2 + 2`
- Deleting characters with `delete(start, end)`

---

### 3. `buffer.java`

Similar to `StringBuilder`, but `StringBuffer` is **thread-safe** (synchronized).

#### 🔹 `simplebuffer()`
- Shows default and dynamic capacity growth
- Appends strings
- Deletes characters
- Demonstrates capacity increase logic: `newCapacity = oldCapacity * 2 + 2`

---

