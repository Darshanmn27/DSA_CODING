### 🔢 Java Map Interface:
 Map interface and its three popular implementations—HashMap, LinkedHashMap, and TreeMap—to count occurrences of elements (both integers and characters) in arrays and strings.
 ---
 ---
### 🧠 Key Concepts
Map Interface in Java: Used to store key-value pairs.

HashMap: Unordered map with constant-time performance.

LinkedHashMap: Maintains insertion order.

TreeMap: Maintains sorted order of keys.
---
### 🧮 1. Occurrences Using HashMap
---
HashMap does not maintain any order of insertion or keys.

✅ Functionalities:
Count occurrences of integers in an array.

Count character frequencies in a string.

Uses containsKey() and getOrDefault() methods for efficient counting.
HashMap does not maintain any order of insertion or keys.

### ✅ Functionalities:
Count occurrences of integers in an array.

Count character frequencies in a string.

Uses containsKey() and getOrDefault() methods for efficient counting.

---
```Java
{1=2, 65=1, 2=2, 3=2, 4=2, 5=2}
{d=1, a=2, r=1, s=1, h=1, n=1}
{10=2, 20=2, 30=2, 40=2}
{d=1, a=2, r=1, s=1, h=1, n=1}
```
---
---

```Java
HashMap<Integer, Integer> map = new HashMap<>();
for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```
---
### 🔁 2. Occurrences Using LinkedHashMap
✅ Functionalities:
Count occurrences of integers while keeping insertion order.

Count character frequencies while preserving the order they appear in.
---
```Java
LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
for (char ch : arr) {
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
```
### 🔡 3. Occurrences Using TreeMap
---
TreeMap maintains sorted order of keys (natural ordering).

✅ Functionalities:
Count and display integers in sorted key order.

Count and display character frequencies sorted alphabetically.

---
```Java
TreeMap<Integer, Integer> map = new TreeMap<>();
for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```
### 🧪 Use Cases
Word and character frequency analysis

Detecting duplicate entries in data

Sorted or ordered display of frequency tables

---



