# Set Matrix Zeroes - Java Implementation

This repository contains two Java implementations for the classic **Set Matrix Zeroes** problem:

- **Brute Force Approach** (`Brute.java`)
- **Optimal In-Place Approach** (`Optimal.java`)

---

## Problem Statement

Given an `m x n` integer matrix, if an element is 0, set its entire row and column to 0. The operation should be done **in-place**, i.e., modify the original matrix directly.

---

## 1. Brute Force Approach (`Brute.java`)

### Description
This approach uses extra space to keep track of rows and columns that need to be zeroed.  
- Traverse the matrix and record rows and columns containing zeros in two boolean arrays.  
- Then, iterate again to set entire rows and columns to zero based on the recorded information.

### Code Summary
- Uses two boolean arrays `rows[]` and `cols[]` to mark rows and columns with zeros.
- After the marking, zero out the corresponding rows and columns.
- Finally, prints the updated matrix.

### Time Complexity
- **O(m * n)** — We traverse the entire matrix multiple times but each pass is linear in terms of the number of elements.

### Space Complexity
- **O(m + n)** — Additional space is used for two boolean arrays to store zero-marked rows and columns.

---

## 2. Optimal In-Place Approach (`Optimal.java`)

### Description
This approach optimizes space usage by using the first row and first column of the matrix itself as storage to mark rows and columns that need to be zeroed.  
- First, determine if the first row or first column contains zeros to handle them separately later.  
- Then, use the first row and first column to mark zero rows and columns for the rest of the matrix.  
- Finally, update the matrix based on these markers, including the first row and column as required.

### Code Summary
- Uses two boolean flags `firstRowZero` and `firstColZero` to track zeros in the first row and column.
- Uses the matrix's first row and column as marker arrays to reduce extra space.
- Updates the matrix in-place and prints the final result.

### Time Complexity
- **O(m * n)** — Single pass for marking and multiple passes to set zeros, all linear in the number of elements.

### Space Complexity
- **O(1)** — No extra space besides a few boolean variables; modifies the matrix in place.

---




---
---
### Brute 

```java

public class Brute {
    public static void setzeroes(int matrix[][]) {
        int m = matrix.length, n = matrix[0].length;
        boolean rows[] = new boolean[m];
        boolean cols[] = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (rows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (cols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };
        setzeroes(matrix);
        /*
         * 1 0 3
         * 0 0 0
         * 7 0 9
         */
    }
}
```
---

### Optimal

---
```java
public class Optimal {
    public static void setZeroesOptimal(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0)
                firstRowZero = true;
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0)
                firstColZero = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };
        setZeroesOptimal(matrix);
        /*
         * 1 0 3
         * 0 0 0
         * 7 0 9
         */

    }

}
```


## Sample Input

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 0, 6},
    {7, 8, 9}
};
