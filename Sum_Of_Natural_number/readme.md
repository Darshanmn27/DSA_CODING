# 🔢 Java Programs: Power of Two Checker & Sum of Natural Numbers

This repository contains two simple and educational Java programs:

1. **Power of Two Checker**
2. **Sum of Natural Numbers**

Each program demonstrates multiple approaches — from brute force to optimized methods — highlighting the logic and efficiency behind them.

---

## 📘 1. Power of Two Checker (Java)

This Java program determines whether a given number is a **power of two** using:

1. **Brute Force Method** – Repeated division by 2
2. **Optimal Bitwise Method** – Checks if the number has only one set bit

### 🚀 Features

- Covers control flow: `while`, `if-else`
- Uses bitwise operations for performance
- Compares naive and optimal logic


### 🔍 How It Works

#### ✅ Brute Force Approach

```java
int num = 168;
while (num % 2 == 0)
{
    num = num / 2;
}
if (num == 1) {
    System.out.println("power of two");
} else {
    System.out.println("not power of two");
}
```


✅ Time Complexity: O(log N)

✅ Space Complexity: O(1)


⚡ Optimal Bitwise Approach
```java
int num = 1024;
if ((num & (num - 1)) == 0) 
{
    System.out.println("power of two");
}
else 
{
    System.out.println("not power of two");
}
```

✅ Time Complexity: O(1)

✅ Space Complexity: O(1)

📌 Output

not power of two
power of two


📗 2. Sum of Natural Numbers (Java)
This Java program calculates the sum of the first N natural numbers using:

Brute Force Method – Iterative summation using a loop

Better Mathematical Method – Using the formula n(n + 1)/2

🚀 Features
Shows basic loop handling

Optimized mathematical computation

Useful for beginner-level coding practice



✅ Brute Force Approach
```java
int num = 5;
int sum = 0;
for (int i = 1; i <= num; i++) {
    sum = sum + i;
}
System.out.println("Total sum is:");
System.out.println(sum); // Output: 15
```
✅ Time Complexity: O(N)

✅ Space Complexity: O(1)

⚡ Better Mathematical Approach
```java
int num = 5;
int sum = (num * (num + 1)) / 2;
System.out.println("Sum of natural number with the help of the better approach is:");
System.out.println(sum); // Output: 15
```


✅ Time Complexity: O(1)

✅ Space Complexity: O(1)
