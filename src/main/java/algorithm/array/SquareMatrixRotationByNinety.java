package algorithm.array;

/**
 * In place rotate square matrix by 90 degree
 */
public class SquareMatrixRotationByNinety {

    public static void main(String[] args) {
        int[][] matix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 13},
                {14, 15, 16, 17}};

        int n = matix.length;

        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i -1; j++) {
                int temp = matix[j][n -1 - i];
                matix[j][n -1 - i] = matix[i][j];
                matix[i][j] = matix[n - 1 - j][i];
                matix[n - 1 - j][i] = matix[n - 1- i][n - 1- j];
                matix[n - 1 - i][n - 1 - j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
