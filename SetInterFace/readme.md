# Java Collection Framework Examples

This repository contains examples demonstrating the use of Java's collection framework, particularly `HashSet`, `LinkedHashSet`, and `TreeSet`. Each class illustrates the storage of unique elements, their properties, and behavior.

## HashSet Example

`HashSet` is a collection that does not allow duplicate values and does not maintain any order.

### Code
```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        int arr[] = { 27, 1, 2, 3, 27, 1, 2, 3, 4, 99, 1, 233 }; //change made here
        HashSet<Integer> hh = new HashSet<>();
        for (int num : arr) {
            hh.add(num);
        } 
        for (Integer num : hh) {
            System.out.print(num + " ");
        }
    }
}
```
---
### OUTPUT
```Java
1 2 3 4 99 233 27 // Output order may vary
```
--- 
### LinkedHashSet Example
LinkedHashSet maintains the insertion order and 
does not allow duplicate values.
---

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 1, 12, 23, 33, 1, 2027, 1947 }; //change made here
        LinkedHashSet<Integer> ll = new LinkedHashSet<>();
        for (int num : arr) {
            ll.add(num);
        }
        for (Integer aa : ll) {
            System.out.print(aa + " ");
        }
    }
}
```
### Output
```java
10 20 1 12 23 33 2027 1947
```

---
### TreeSet Example
TreeSet stores elements in a sorted order and 
does not allow duplicate values.
---
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 27, 12, 3, 4, 5, 27 }; //change made here
        TreeSet<Integer> tt = new TreeSet<>();
        for (int num : arr) {
            tt.add(num);
        }
        for (Integer aa : tt) {
            System.out.print(aa + " ");
        }
    }
}
```
---
### Output
```
1 2 3 4 5 12 27
```

---
### Conclusion
These examples demonstrate the basic usage of HashSet, LinkedHashSet, and TreeSet. Each data structure has its unique characteristics regarding ordering and duplication. Feel free to modify and experiment with the code to gain a deeper understanding of how these collections work.
