package datastructure.problem.array;

import java.util.Arrays;

/**
 * Possible triangles only of its sides (A,B and C) meet the following conditions:
 * 1) A + B > C
 * 1) B + C > A
 * 1) C + A > B
 */
public class PossibleNumberOFTriangle {

    public static void main(String[] args) {
        int[] array = {12, 90, 38, 35, 95, 250, 255};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int result = trianglesCount(array, array.length);
        System.out.println("Total number of triangles :"+ result);
    }

    private static int trianglesCount(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < n - 2; i++) {

            for (int j = i+1; j <n ; j++) {

                int k = i + 2;
                while (k < n && (array[i]+array[j]) > array[k]){
                    k++;
                }

                count = count + (k -1) - j;
            }
        }

        return count;
    }
}
