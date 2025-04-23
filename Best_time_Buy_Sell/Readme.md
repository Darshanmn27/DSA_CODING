# 📈 Best Time to Buy and Sell Stock

This Java program finds the maximum profit that can be achieved from a single buy and sell operation of stock prices given in an array.

---

## 💡 Problem Statement

You are given an array `arr[]` where each element represents the price of a stock on a given day.  
Your task is to determine the **maximum profit** you can make by buying on one day and selling on another **later day**.

- You **must buy before you sell**.
- If no profit is possible, return 0.

---

## ✅ Example

```java
Input:  arr[] = {7, 1, 5, 3, 6, 4}
Output: Maximum Profit: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5
```
----
----
```java
public class Best_Time {

    public static void buySellStock() {
        int[] arr = {7, 1, 5, 3, 6, 4};

        if (arr == null || arr.length == 0) {
            System.out.println("Maximum Profit: 0");
            return;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        buySellStock();
    }
}
```
---


### 🧮 Time & Space Complexity
---
### Complexity	Description
⏰ Time	  O(n) - Iterates through the array once.
---

🧠 Space	O(1) - Constant space is used regardless of input size.


