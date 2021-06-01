package datastructure.problem.array;

public class PrintMatrixDiagonally {

    public static void main(String[] args) {
        {
            int[][] matrix = {{1,  2,  3,  4, 5},
                                {6,  7,  8, 9, 10},
                                {11, 12, 13, 14, 15},
                                {16, 17, 18, 19, 20}};

            int m = matrix.length;
            int n = matrix[0].length;
            int i = 0,j = 0;
            for (int k = 0; k < m ; k++) {
                i = k;
                j = 0;
                while (i >= 0) {
                        System.out.print(matrix[i--][j++] + " ");
                }

            }

            for (int k = 1; k < n ; k++) {
                i = m-1;
                j = k;
                while (j <= n-1) {
                    System.out.print(matrix[i--][j++] + " ");
                }

            }

        }
    }
}
