package algorithm.array;

/**
 * You are given a matrix of m x n elements (m rows, n columns),
 * Write a Program to print all elements of the matrix in spiral order
 */
public class MatrixPrintingInSpiralFormat {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(matrix[0].length);
        System.out.println(matrix.length);
        int k = 0;
        int m = matrix[0].length - 1;
        int n = 0;
        int p = matrix.length - 1;
        int i = 0, j = 0;
        while (true) {
            if (m <= k && p <= n) {
                break;
            }
            i = k;
            for (j = k; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            j = m;
            for (i = n; i < p; i++) {
                System.out.print(matrix[i][j] + " ");
            }

            i = p;
            for (j = m; j > k; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            j = k;
            for (i = p; i > n; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            k++;
            m--;
            p--;
            n++;
        }
    }
}
