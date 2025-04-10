
# 🧩 Find the Missing Number in an Array

## 🔍 Problem Statement

Given an array containing **`n` distinct numbers taken from the range `1` to `n+1`**, exactly one number is missing. Your task is to find the **missing number**.

### 🧠 Example:

```java
Input:  arr[] = {5, 6, 4, 2, 1}
Output: 3
```

---

## ✅ Approaches & Explanations

---

### 🚨 1. Brute Force Approach

```java
public static void brute() {
    int arr[] = {5, 6, 4, 2, 1};
    int num = arr.length + 1;

    for (int i = 1; i <= num; i++) {
        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(i);
            break;
        }
    }
}
```

#### 🧮 Time Complexity:
- **O(N²)** – because of the **nested loops**

#### 💾 Space Complexity:
- **O(1)** – no extra space used

#### ❌ Why Not Good?
- Poor performance on large arrays.
- Nested loop makes it inefficient.
- Not scalable for real-world datasets.

---

### 🧠 2. Better Approach (Using Frequency Array)

```java
public static void better() {
    int arr[] = {5, 6, 4, 2, 1};
    int num = arr.length + 1;
    int[] freq = new int[num + 1]; // initialized to 0 by default

    for (int i = 0; i < arr.length; i++) {
        freq[arr[i]] = 1; // mark presence
    }

    for (int i = 1; i <= num; i++) {
        if (freq[i] == 0) {
            System.out.println(i); // missing number
            break;
        }
    }
}
```

#### 🧮 Time Complexity:
- **O(N)**

#### 💾 Space Complexity:
- **O(N)** – extra space for frequency array

#### ✅ Pros:
- Much faster than brute force
- Easy to implement

#### ❌ Cons:
- Uses extra space (not optimal)
- Not suitable for memory-constrained environments

---

### ⚡ 3. Optimal Approach 1 (Sum Formula)

```java
public static void optimal1() {
    int arr[] = {5, 6, 4, 2, 1};
    int n = arr.length + 1;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : arr) {
        actualSum += num;
    }

    System.out.println(expectedSum - actualSum);
}
```

#### 🧮 Time Complexity:
- **O(N)**

#### 💾 Space Complexity:
- **O(1)**

#### ✅ Pros:
- Most space-efficient approach
- Simple and fast

#### ❌ Cons:
- Can lead to **integer overflow** if `n` is very large
- Only works for **positive integers**

---

### ⚡ 4. Optimal Approach 2 (Using XOR — most robust)

```java
public static void optimalXOR() {
    int arr[] = {5, 6, 4, 2, 1};
    int xor = 0;
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        xor ^= arr[i];   // XOR of array
        xor ^= (i + 1);  // XOR of natural number
    }

    xor ^= (n + 1); // XOR with the last number

    System.out.println(xor); // Missing number
}
```

#### 🧮 Time Complexity:
- **O(N)**

#### 💾 Space Complexity:
- **O(1)**

#### ✅ Pros:
- Avoids integer overflow
- Works even with **very large numbers**
- No extra space needed

#### ❌ Cons:
- Slightly less intuitive if you're new to bitwise operations

---

## 🏁 Conclusion

| Approach        | Time Complexity | Space Complexity | Notes                                |
|----------------|------------------|------------------|--------------------------------------|
| Brute Force     | O(N²)           | O(1)             | ❌ Not suitable for large input       |
| Better (Freq)   | O(N)            | O(N)             | ✅ Faster but uses extra space        |
| Optimal (Sum)   | O(N)            | O(1)             | ✅ Efficient but risk of overflow     |
| Optimal (XOR)   | O(N)            | O(1)             | ✅ Most robust and scalable           |

---

## 📚 Recommended Use

- ✅ Use **XOR** or **Sum Formula** for real-world coding interviews and production-level code.
- ❌ Avoid **Brute Force** — it doesn't scale and is inefficient.
- ⚠️ Use **Frequency Array** only when memory isn't a constraint.

