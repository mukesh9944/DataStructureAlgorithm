package datastructure.problem.array;

import java.util.Arrays;

public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 36, 46},
                {28, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int N = matrix.length;
        int searchElement = 50;
        System.out.println(N);
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));

        int i = 0, j = N - 1;
        boolean isFound = false;
        while (i < N && j >= 0) {
            if (matrix[i][j] == searchElement) {
                isFound = true;
                break;
            }
            if (matrix[i][j] > searchElement) {
                j--;
            } else {
                i++;
            }
        }
        if (isFound) {
            System.out.println("Element found at matrix[" + i + "][" + j + "]");
        } else {
            System.out.println("Element not found : " + searchElement);
        }

    }
}
