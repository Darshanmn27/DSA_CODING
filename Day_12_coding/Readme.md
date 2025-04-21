# Two Sum Problem in Java 🧮

This project demonstrates two approaches to solve the classic **Two Sum** problem in Java:

1. **Brute-force approach**
2. **Optimal approach using HashMap**

Given an array of integers and a target sum, the goal is to return the indices of the two numbers that add up to the target.

---

## 📌 Problem Statement

> Given an array `arr[]` and a target value `tar`, find **two distinct indices** `i` and `j` such that:
> 
> ```
> arr[i] + arr[j] == tar
> ```

If no such pair exists, return `[-1, -1]`.

---

## 🧪 Example

### Input:
## arr = [2, 7, 11, 15]
## target = 9
```java
public class Two_sum_Brute
{

    public  static  int [] brute(int arr[],int tar)
    {
        if(arr==null)
        {
            System.out.println("input array is null:");
            return  new int[] {-1,-1};
        }
        if(arr.length<2)
        {
            System.out.println("array   must  contain  atleast two  elements:");
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        int arr[]={2,7,11,15};
        int target=9;
        int  newarr[]= new int[2]; // two  store   two indexes
        newarr=brute(arr, target);
        System.out.println("{"+newarr[0]+","+ newarr[1]+"}");//{0,1}
    }
    
}
```



---

### ✅ Time Complexity:
O(n^2)

​
---
### Space Complexity:
You only use:
A return array of size 2 → O(1)

No additional data structures or memory allocations

###  ✅ Space Complexity:
 O(1)( constant space )




---
### 🚀 Optimal Approach

## Logic:
Use a HashMap to store the complement of each number as you iterate.

## Check if the complement exists in the map.

---

```java
import java.util.HashMap;

public class Optimal 
{

    public  static   int [] optimalapproach(int arr[],int tar)
    {
        if(arr==null)
        {
            System.out.println("input array is null:");
            return  new int[] {-1,-1};
        }
        if(arr.length<2)
        {
            System.out.println("array   must  contain  atleast two  elements:");
            return new int[]{-1,-1};
        }

        HashMap<Integer,Integer> map=  new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=tar-arr[i];
            if(map.containsKey(diff))
            {
                return  new int[]{map.get(diff),i};
            }
            map.put(arr[i], i);
        }
        return  new int[]{-1,-1};
    }


    public static void main(String[] args) 
    {
        int arr[]={-3,4,3,9};
        int tar=0;
        int result[]= new int[2];
        result=optimalapproach(arr, tar);
        System.out.println("{ "+result[0]+", "+result[1]+"}");
        //{ 0, 2}==> arr[0]+arr[2]==> -3+3==0 target==0    so  out put {0,2}
        
    }
    
}

```

---

### ⏱️ Time Complexity:
O(n) — linear time by using a single pass through the array.

### 💾 Space Complexity:
O(n) — due to the storage used by the HashMap.



---
### 💡 Conclusion
Use the brute-force solution for understanding the logic behind the problem.

Use the optimal solution in real-world applications or interviews for better performance.


---


