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
