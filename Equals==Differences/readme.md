### 🔤 String Manipulation in Java
This repository demonstrates various scenarios of string comparison in Java, including reference comparison (==), value comparison (.equals()), and case-insensitive value comparison (.equalsIgnoreCase()).



---
📘 Overview of String Comparison Cases
✅ stringManipulation.java
🔹 case1()
Strings: Created using string literals.

Comparison using ==: References are the same (due to string pool).

✅ Output: references are equal

🔹 case2()
Strings: One literal, one new String().

Comparison using ==: References are different.

Comparison using .equals(): Values are same.

✅ Output:

sql
Copy code
referneces are not equal
values are equal
✅ stringManipulate2.java
🔹 case3()
Strings: Both created using new String().

Comparison using ==: References are different.

Comparison using .equals(): Values are same.


---

```java
public class stringManipulation {
    public static void case1() {
        String s1 = "JAVA";
        String s2 = "JAVA";
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("referneces  are not  equal ");
        }
    }

    public static void case2() {
        String s1 = "DARSHAN";
        String s2 = new String("DARSHAN");
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("referneces  are not  equal ");
        }

        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not  equal ");
        }
    }

    public static void main(String[] args) {
        case1();// references are equal
        case2();// referneces are not equal
        // values are equal

    }
}
```
---
```java
public class stringManipulate2 {
    public static void case3() {
        String s1 = new String("DARSHAN");
        String s2 = new String("DARSHAN");
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("references are not equal");
        }
        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not equal ");
        }
    }

    public static void case4() {
        String s1 = "DARSHAN";
        String s2 = "darshan";
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("references are not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not equal");
        }
    }

    public static void main(String[] args) {
        case3();
        // references are not equal
        // values are equal
        case4();
        // references are not equal
        // values are not equal
    }

}
```
---
---
```java 
public class stringManipulation3 {
    public static void case5() {
        String s1 = "DARSHAN";
        String s2 = "darshan";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println(" values are not  equal ");
        }
    }

    public static void main(String[] args) {
        case5();
        // values are equal

    }

}
```
---
### 📚 Key Takeaways
== compares object references.

.equals() compares object values (case-sensitive).

.equalsIgnoreCase() compares values ignoring case.

Always prefer .equals() or .equalsIgnoreCase() for value-based string comparison.