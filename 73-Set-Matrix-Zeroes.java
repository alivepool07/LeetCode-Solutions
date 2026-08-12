class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int r = 0; r < m; r++) {
            if (matrix[r][0] == 0) firstColHasZero = true;
        }
        for (int c = 0; c < n; c++) {
            if (matrix[0][c] == 0) firstRowHasZero = true;
        }
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        if (firstColHasZero) {
            for (int r = 0; r < m; r++) {
                matrix[r][0] = 0;
            }
        }
        if (firstRowHasZero) {
            for (int c = 0; c < n; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}