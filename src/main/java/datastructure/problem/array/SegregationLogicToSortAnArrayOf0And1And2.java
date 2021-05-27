package datastructure.problem.array;

import java.util.Arrays;

/**
 * Using counting sorts
 */
public class SegregationLogicToSortAnArrayOf0And1And2 {

    public static void main(String[] args) {
        int[] array = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int low = 0, mid = 0, high = array.length-1;

        while (mid <= high) {

            if(array[mid] == 2){
                swapNumber(array, mid, high);
                high--;
            } else if (array[mid] == 0) {
                swapNumber(array, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }

        }

        System.out.println(Arrays.toString(array));
    }

    private static void swapNumber(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
