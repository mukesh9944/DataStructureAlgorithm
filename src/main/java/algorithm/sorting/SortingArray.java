package algorithm.sorting;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] intArray = {20, -22, 35, -15, 7, 55, 1};

        Arrays.sort(intArray);
        //Arrays.parallelSort(intArray);

        printArray(intArray);

    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
