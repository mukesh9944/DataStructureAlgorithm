package datastructure.problem.array;

import java.util.Arrays;

public class MergeSortMethodToCountInversionInAnArray {

    public static void main(String[] args) {
        int[] array = {9, 1, 6, 4, 5};

        System.out.println(mergeSortAndCount(array, 0, array.length - 1));
    }

    private static int mergeSortAndCount(int[] array, int left, int right) {
        int inv_count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            inv_count += mergeSortAndCount(array, left, mid);

            inv_count += mergeSortAndCount(array, mid + 1, right);

            inv_count += mergeSort(array, left, mid, right);
        }
        return inv_count;
    }

    private static int mergeSort(int[] array, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, mid+1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0, j = 0, k = left, swap = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
                swap += (mid + 1) - (left + i);
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
        return swap;
    }
}
