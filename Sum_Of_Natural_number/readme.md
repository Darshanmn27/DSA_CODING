# Power of Two Checker (Java)

This Java program determines whether a given number is a power of two using **two different approaches**:

1. **Brute Force Method** – repeatedly divides the number by 2.
2. **Optimal Method** – uses bitwise operation to check the power of two.

## 🚀 Features

- Demonstrates basic control flow (if-else, while loop)
- Shows efficient use of bitwise operations
- Educational comparison between brute force and optimal techniques

## 📁 File Structure

Power_Of_two_OR_Not.java README.md


## 🔍 How It Works

### 1. Brute Force Approach

- Keep dividing the number by 2 while it is even.
- If the result is 1, it's a power of two.

```
int num = 168;
while (num % 2 == 0) 
{
    num = num / 2;
}
if (num == 1) 
{
    System.out.println("power of two");
} 
else 
{
    System.out.println("not power of two");
}
```
###2. Optimal Bitwise Approach
A number is a power of two if it has only one bit set in binary.

Bitwise check: num & (num - 1) == 0

```
int num = 1024;
if ((num & (num - 1)) == 0) 
{
    System.out.println("power of two");
} else 
{
    System.out.println("not power of two");
}

```
📌 Output
not power of two
power of two




# Sum of Natural Numbers (Java)

This Java program calculates the **sum of the first N natural numbers** using two approaches:

1. **Brute Force Method** – Iterative addition using a loop.
2. **Better Approach** – Uses the direct mathematical formula `n(n + 1) / 2`.

## 🚀 Features

- Demonstrates loop-based and formula-based techniques
- Highlights efficiency improvement
- Simple and beginner-friendly Java logic



## 🔍 How It Works

### 1. Brute Force Approach

- Adds numbers from 1 to `n` using a for-loop.

```java
int num = 5;
int sum = 0;
for (int i = 1; i <= num; i++) 
{
    sum = sum + i;
}
System.out.println("Total sum is:");
System.out.println(sum); // Output: 15
```

2. Better Mathematical Approach
Applies the direct formula:

Sum=𝑛(𝑛+1)/2
```

int num = 5;
int sum = (num * (num + 1)) / 2;
System.out.println("Sum of natural number with the help of the better approach is:");
System.out.println(sum); // Output: 15
```
📌 Output

total sum is :
15
sum of natural number with the help of the better approach is :
15

