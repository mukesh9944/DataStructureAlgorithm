package datastructure.problem.array;

import java.util.Arrays;

public class InPlaceTechniquesMatrixRotationMethodBy90Degree {

    public static void main(String[] args) {

        int [][] matrix = { {1,  2,  3,  4},
                            {5,  6,  7,  8},
                            {9,  10, 11, 12},
                            {13, 14, 15, 16}
                           };

        int N = matrix.length;
        System.out.println(N);
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));

        for (int i = 0; i < N/2; i++) {

            for (int j = i; j < N - i - 1; j++) {

                int temp = matrix[j][N - i - 1];
                matrix[j][N - i - 1] = matrix[i][j];
                matrix[i][j] = matrix[N - j - 1][i];
                matrix[N - j - 1][i] = matrix[N - i - 1][N - j - 1];
                matrix[N - i - 1][N - j - 1] = temp;

            }
        }
        System.out.println("---------------------------------------");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));
    }
}
