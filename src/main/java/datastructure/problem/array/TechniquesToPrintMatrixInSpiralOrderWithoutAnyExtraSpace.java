package datastructure.problem.array;

public class TechniquesToPrintMatrixInSpiralOrderWithoutAnyExtraSpace {

    public static void main(String[] args) {
        int[][] matrix = {{1,  2,  3,  4},
                          {5,  6,  7,  8},
                          {9,  10, 11, 12},
                          {13, 14, 15, 16}};

        int k = 0, m = matrix.length -1, n = 0, p = matrix.length-1;
        int i = 0, j = 0;
        for (int itr = 0; itr < matrix.length / 2; itr++) {

            i = n;
            for (j = k; j < m ; j++){
                System.out.print(matrix[i][j]+" ");
            }

            j = m;
            for(i = n; i < p; i++){
                System.out.print(matrix[i][j]+" ");
            }

            i = p;
            for (j = m; j > k; j--){
                System.out.print(matrix[i][j]+" ");
            }

            j  = k;
            for (i = p; i > n; i--){
                System.out.print(matrix[i][j]+" ");
            }

            k++;
            m--;
            n++;
            p--;

        }
    }
}
