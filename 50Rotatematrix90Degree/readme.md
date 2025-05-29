# 🔄 Matrix Rotation in Java (90 Degrees Clockwise)

This project demonstrates two methods to rotate a **square matrix** 90 degrees **clockwise** using Java:

1. `RotateMatrix` – Brute Force approach using an auxiliary matrix.
2. `RotateImageOptimal` – Optimal In-place approach using matrix transposition and row reversal.

---

## 📌 Problem Statement

Given an `n x n` 2D matrix, rotate the matrix by 90 degrees clockwise.

---

---

## 🚀 Approach 1: Brute Force – `RotateMatrix`

This approach creates a new matrix (`result`) and fills it by moving elements from the original matrix to their rotated positions.

### 🔁 Steps:
- Create a new matrix `result`.
- Copy elements from the original matrix to the rotated positions in `result`.
- Copy `result` back to the original matrix.

### ✅ Time Complexity:
O(n^2) – Each element is visited once.

### ✅ Space Complexity:
O(n^2) – Uses an extra matrix for storing the rotated version.

---
```Java
public class RotateMatrix {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    public static void main(String[] darshan) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        RotateMatrix rm = new RotateMatrix(); // Create object
        rm.rotate(matrix); // Call method on object

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
---

---

## 🚀 Approach 2: Optimal In-Place – `RotateImageOptimal`

This approach rotates the matrix in place using two steps:

1. **Transpose the matrix**: Swap matrix[i][j] with matrix[j][i].
2. **Reverse each row**: Swap elements symmetrically in each row.

### ✅ Time Complexity:
O(n^2) – Each element is visited once for transpose + once for row reversal

### ✅ Space Complexity:
O(1) – No extra space used (in-place rotation).
---
```Java
public class RotateImageOptimal {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        RotateImageOptimal rotator = new RotateImageOptimal();
        rotator.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
```
---