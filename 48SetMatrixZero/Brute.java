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