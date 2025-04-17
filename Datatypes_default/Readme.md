 # 🧠 Java Default Values in Arrays

This project explores how **Java initializes default values** for different data types when arrays are created without explicitly assigning values.

When you create an array in Java, each element is initialized with a **default value** depending on the data type:

- **Primitive data types**: Automatically initialized to their type-specific default.
- **Reference types** (like `String`): Initialized to `null`.

---



## 🚀 Output Examples

### ✅ `Boolean.java`

#### ➤ boolean default values
```java
boolean[] arr = new boolean[5];
for (boolean num : arr) {
    System.out.print(num + " ");
}
```

### ✅ `character.java`

#### ➤ character default values
```java
char[] arr = new char[5];
for (char num : arr) {
    System.out.print(num);
}

```

### ✅ `float.java`

#### ➤ float default values
```java
float[] arr = new float[5];
for (float num : arr) {
    System.out.print(num + " ");
}
```

### ✅ `double.java`

#### ➤  double default values
```java
double[] arr = new double[5];
for (double num : arr) {
    System.out.print(num + " ");
}

```

### ✅ `numbers.java`

#### ➤ integer default values
```java
int[] arr = new int[5];
for (int num : arr) {
    System.out.print(num + " ");
}

```

### ✅ `byte.java`

#### ➤ byte default values
```java
byte[] arr = new byte[5];
for (byte num : arr) {
    System.out.print(num + " ");
}

```
### ✅ `byte.java`

#### ➤ byte default values
```java
byte[] arr = new byte[5];
for (byte num : arr) {
    System.out.print(num + " ");
}

```
### ✅ `short.java`

#### ➤ short default values
```java
short[] arr = new short[5];
for (short num : arr) {
    System.out.print(num + " ");
}


```
### ✅ `long.java`

#### long default values
```java
long[] arr = new long[5];
for (long num : arr) {
    System.out.print(num + " ");
}


```
### ✅ `string.java`

#### string default values
```java
String[] arr = new String[5];
for (String s : arr) {
    System.out.print(s + " ");
}

```
---

📌 Key Takeaways
Java assigns default values when arrays are declared without initialization.

These defaults vary based on the type:

boolean → false

char → \u0000 (prints as blank)

byte, short, int, long → 0

float, double → 0.0

String (reference types) → null

---

# 🧠 Java Program: User Input for All Primitive Data Types Using Scanner

This Java program demonstrates how to take user input for **all primitive data types** (`byte`, `short`, `int`, `long`, `float`, `double`, `char`) and `String` using the `Scanner` class.

## 📌 What You’ll Learn
- How to take input from the user using `Scanner`
- How to capture values of different data types
- How to read single characters and full strings

---

## 🧾 Java Code

```java
import java.util.Scanner;

public class AllDataTypeInputs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter byte value:");
        byte b = s.nextByte();

        System.out.println("Enter short value:");
        short ss = s.nextShort();

        System.out.println("Enter integer value:");
        int num = s.nextInt();

        System.out.println("Enter long value:");
        long ll = s.nextLong();

        System.out.println("Enter float value:");
        float f = s.nextFloat();

        System.out.println("Enter double value:");
        double dd = s.nextDouble();

        System.out.println("Enter a character:");
        char ch = s.next().charAt(0);

        s.nextLine(); // Clear the newline left in buffer

        System.out.println("Enter a string:");
        String val = s.nextLine();

        System.out.println("\n--- Output ---");
        System.out.print(b + " " + ss + " " + num + " " + ll + " " + f + " " + dd + " " + ch + " " + val);

        s.close();
    }
}

```

### Conclusion
This program gives you a clear and simple way to take different types of user input in Java using the Scanner class. It's a great start for learning input handling, especially in console-based applications.






---

### Java Primitive Data Types and Their Sizes
This program demonstrates the sizes (in bits) of various primitive data types in Java using 
the respective constants provided by Java's wrapper classes (e.g., Byte.SIZE, Short.SIZE). 
The program prints the size of each data type along with a brief explanation.

---
```java
public class DataTypeSizes {
    public static void main(String[] args) {
        System.out.println("Primitive Data Types and Their Sizes:\n");

        System.out.println("byte      : " + Byte.SIZE + " bits  ➝ " + (Byte.SIZE / 8) + " byte");
        System.out.println("short     : " + Short.SIZE + " bits ➝ " + (Short.SIZE / 8) + " bytes");
        System.out.println("int       : " + Integer.SIZE + " bits ➝ " + (Integer.SIZE / 8) + " bytes");
        System.out.println("long      : " + Long.SIZE + " bits ➝ " + (Long.SIZE / 8) + " bytes");
        System.out.println("float     : " + Float.SIZE + " bits ➝ " + (Float.SIZE / 8) + " bytes");
        System.out.println("double    : " + Double.SIZE + " bits ➝ " + (Double.SIZE / 8) + " bytes");
        System.out.println("char      : " + Character.SIZE + " bits ➝ " + (Character.SIZE / 8) + " bytes (Unicode)");
        System.out.println("boolean   : Size not precisely defined (depends on JVM)");
    }
}
```
---
``` java
Primitive Data Types and Their Sizes:

byte      : 8 bits  ➝ 1 byte
short     : 16 bits ➝ 2 bytes
int       : 32 bits ➝ 4 bytes
long      : 64 bits ➝ 8 bytes
float     : 32 bits ➝ 4 bytes
double    : 64 bits ➝ 8 bytes
char      : 16 bits ➝ 2 bytes (Unicode)
boolean   : Size not precisely defined (depends on JVM)
```

---
### Explanation of Each Data Type:

byte: 8 bits (1 byte), used for saving memory in large arrays.

short: 16 bits (2 bytes), typically used for saving memory when working with large data sets.

int: 32 bits (4 bytes), commonly used for integers in Java.

long: 64 bits (8 bytes), used when larger integer values are needed.

float: 32 bits (4 bytes), used for storing single-precision floating-point numbers.

double: 64 bits (8 bytes), used for storing double-precision floating-point numbers.

char: 16 bits (2 bytes), used to store a single 16-bit Unicode character.

boolean: The size of boolean is not strictly defined as it depends on the JVM, typically represented as a bit (1 bit) but could vary.


---

### Conclusion
This program provides a quick reference for the sizes of Java's primitive data types in bits and bytes. Understanding these sizes can be crucial for optimizing memory usage, especially when working with large data sets or in performance-critical applications








