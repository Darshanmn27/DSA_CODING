# TitleToNumber - Excel Column Title to Number Converter

This Java program converts an Excel sheet column title (e.g., "A", "AB", "ZY") to its corresponding column number.

## Problem Description

Given a string representing the column title as it appears in an Excel sheet, return its corresponding column number.

- Example:  
  - "A" → 1  
  - "AB" → 28  
  - "ZY" → 701

## Code Snippet

```java
public class TitleToNumber {
    public static int titletoNumber(String column) {
        int result = 0;
        column = column.toUpperCase();

        for (int i = 0; i < column.length(); i++) {
            char ch = column.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(titletoNumber("A"));   // Output: 1
        System.out.println(titletoNumber("AB"));  // Output: 28
        System.out.println(titletoNumber("ZY"));  // Output: 701
    }
}
```

### Time Complexity
O(n) where n is the length of the input string columnTitle.

We process each character once.

### Space Complexity
O(1) constant extra space.

The space used does not depend on the input size; only a few integer variables are used.




# 🔠 Excel Column Title Converter

This Java program converts a given positive integer (column number) to its corresponding Excel column title.

### 🧠 Problem Explanation

In Excel:
- A → 1  
- B → 2  
- ...  
- Z → 26  
- AA → 27  
- AB → 28  
- ...  
- BYY → 2027

This is a **base-26 encoding** system where:
- 'A' maps to 1 (not 0),
- The calculation is adjusted using `columnNumber - 1` before taking modulo.

---

### ✅ Example

```java
Input:  2027  
Output: BYY
public class convertToTitle {
    public static void conversion(int columnnumber) {
        StringBuilder sb = new StringBuilder();
        while (columnnumber > 0) {
            columnnumber--;
            char c = (char) ('A' + (columnnumber % 26));
            sb.append(c);
            columnnumber /= 26;
        }
        System.out.println(sb.reverse().toString());
    }

    public static void main(String[] args) {
        conversion(2027);// BYY

    }

}
```