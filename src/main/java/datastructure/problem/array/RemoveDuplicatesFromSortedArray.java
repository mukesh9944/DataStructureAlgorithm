package datastructure.problem.array;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, Time complexity O(n) and Space complexity O(1)
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i+1] || array.length - 2 == i){
                array[j++] = array[i];
            }
        }
        while (j < array.length) {
            array[j++] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
