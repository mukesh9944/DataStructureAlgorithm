package datastructure.problem.array;

public class FindRowWithMaxOnes {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 1, 1}};

        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {

            int index = binarySearch(matrix[i], 0, col - 1);
            if (index != -1 && col - index > res) {
                res = col - index;
            }
        }

        System.out.println("Maximum 1's = " + res);
    }

    private static int binarySearch(int[] matrix, int start, int end) {

        int mid = (start + end) / 2;

        if ((mid != 0 && matrix[mid - 1] == 0) && matrix[mid] == 1) {
            return mid;
        }

        if (matrix[mid] == 0) {
            return binarySearch(matrix, mid + 1, end);
        } else {
            return binarySearch(matrix, start, mid - 1);
        }
    }
}
