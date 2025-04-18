# Maximum Consecutive 1's in an Array

This Java program calculates the **maximum number of consecutive 1's** present in a given array of integers.

## 🧠 Problem Statement

Given an array of integers, count the **maximum number of consecutive 1's** in the array.

### ✅ Example

Input:
```java
public class Max_count
{
    public  static void maximum_consecutive_ones()
    {
        int arr[]={1,1,1,1,1,1,12,2,3,4,5,5,67,7,1,1,1,1,6,6,6,1};
        int count =0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max, count);
            }
            else
            {
                count=0;
            }
        }
        System.out.println("Maximum consecutive 1's:"+max);
    }
    public static void main(String[] args) 
    {
        maximum_consecutive_ones();
        
    }
}
```

---
### 🚀 How It Works
Iterate through the array using a loop.

Keep a counter to track the current streak of 1s.

Reset the counter when a non-1 is encountered.

Track the maximum count using Math.max().
---


### ⏱️ Time & Space Complexity

Type	          |    Complexity |	     Explanation
Time Complexity	  |     O(n)	  |     Single traversal through the array
Space Complexity  | 	   O(1)	  |      Only uses two variables: count and max