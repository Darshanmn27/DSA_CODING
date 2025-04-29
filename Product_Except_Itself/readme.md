# Product Array Without Self

## Overview

This project demonstrates two different approaches (brute-force and optimal) to calculate a product array, where each element in the resulting array is the product of all the numbers in the input array except the element at the current index.

## Code

### Brute Force Approach

```java
public class Brute 
{
    public  static  void produArray_Brute()
    {
        int arr[]={1,2,3,4};
        int res[]= new int[arr.length];     
        if(arr.length==0)
        {
            System.out.println("input  array  is  empty");
            return;
        }
        if(arr.length==1)
        {
            System.out.println("output :[1]");
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            res[i]=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    res[i]*=arr[j];
                }
            }
        }
        for(int num:res)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) 
    {
        produArray_Brute(); // Output: 24 12 8 6
    }
}
```
---


### Time Complexity
- **Brute Force**: `O(n²)` — two nested loops are used.
- **Optimal**: `O(n)` — two linear passes over the array.

---

### Optimal Approach
---
```java
public class Optimal
{
    public  static  void produArray()
    {
        int arr[]={1,2,3,4};
        int result[]=new int[arr.length];
        result[0]=1;
        if(arr.length==0)
        {
            System.out.println("input  array  is  empty");
            return;
        }
        if(arr.length==1)
        {
            System.out.println("output :[1]");
            return;
        }
        for(int i=1;i<arr.length;i++)
        {
            result[i]=result[i-1]*arr[i-1];
        }
        int sufixproduct=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            sufixproduct=sufixproduct*arr[i+1];
            result[i]*=sufixproduct;
        }
        for(int num:result)
        {
            System.out.print(num+" ");
        }
    }
    public static  void  main(String darshan[])
    {
        produArray(); // Output: 24 12 8 6
    }
}
```
### Time Complexity
### Time Complexity: O(n) since it only requires two passes through the array.
### Space Complexity: O(1) for the result array aside from the output, as no additional space proportional to input size is required.
