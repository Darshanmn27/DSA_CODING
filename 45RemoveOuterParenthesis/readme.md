# 🔵 Day 45 of #100DaysOfCode  

Today's challenge was all about tackling a **classic string manipulation problem**—**Removing Outermost Parentheses**—implemented efficiently in **Java** using a straightforward approach. 🚀  

---

## 🧩 Problem Statement  
Given a valid parentheses string, remove the **outermost parentheses** from each primitive part and return the modified string.  

### ✅ Example:
```java
Input:  "(()())(())"  
Output: "()()()"  
```
🛠 Approach (Efficient Single-Pass Solution)
💡 Idea: Use a counter variable (openCount) to track parentheses depth and intelligently append only inner parentheses to the result string.

⏱️ Time Complexity: O(N) — Single pass through the input string.
📦 Space Complexity: O(N) — Stores output using StringBuilder.
✅ Verdict: Fast, readable, and ideal for solving this problem efficiently.

---
```Java
public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String str) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) result.append(c); // Skip outer '('
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) result.append(c); // Skip outer ')'
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        System.out.println(removeOuterParentheses(input)); // Output: "()()()"
    }
}

```
---
### 🧠 Key Learnings
✅ Strengthened understanding of string traversal and parentheses balancing 
✅ Practiced single-pass character filtering for efficient string manipulation 
✅ Reinforced the importance of tracking depth when handling nested structures

