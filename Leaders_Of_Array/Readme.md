# 👑 Leaders in an Array - Java Implementation

This project contains two Java implementations to find all **leaders in a given array**.

A **leader** in an array is an element that is **greater than or equal to all the elements to its right**.

---

## 📌 Problem Statement

Given an array of integers, find all the leaders in the array.  
An element `arr[i]` is a leader if:


---



---

## 🧠 Approaches Implemented

### 1. Brute Force Approach

- For each element, compare it with every element to its right.
- If no greater element is found, it is a leader.

```java
for (int i = 0; i < arr.length; i++) {
    boolean isLeader = true;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
            isLeader = false;
            break;
        }
    }
    if (isLeader) {
        leader.add(arr[i]);
    }
}

```

---

### ✅ Time Complexity:
O(n²) – For each element, we may traverse all the elements to the right.

### ✅ Space Complexity:
O(k) – Where k is the number of leaders found and stored in the result list.


----

----

### 2. Optimal Approach (Right-to-Left Traversal)
---

Start from the rightmost element and keep track of the maximum seen so far.

Any element greater than this max is also a leader.

---
```java
import  java.util.*;

public class Optimal 
{

    public  static  void leaderoptimal()
    {
        int arr[]={16,17,4,3,5,2};
        List<Integer> leader=  new ArrayList<>();

         if(arr==null ||arr.length==0)
        {
            System.out.println("array  is  null   or   empty     no  leaders.");
            return;
        }
        int maxright=arr[arr.length-1];
        leader.add(maxright);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>maxright)
            {
                maxright=arr[i];
                leader.add(maxright);
            }
        }
        Collections.reverse(leader);
        System.out.println("leaders  of  a  given  array :");
        System.out.println(leader);
    }


    public static void main(String[] args) 
    {
        leaderoptimal();
    }
    
}

```
---



### ✅ Time Complexity:
O(n) – Only a single pass through the array.

✅ Space Complexity:
O(k) – Where k is the number of leaders.


---

---
### 💡 Sample Input & Output
```java
int arr[] = {16, 17, 4, 3, 5, 2};
```
### Output = [17, 5, 2]





