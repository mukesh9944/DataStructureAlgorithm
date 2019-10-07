package com.mukesh.example.sortalgorithm;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {2, 8, 3, 2, 9, 1, 7, 10, 8, 4};
        countingSort(intArray, 1, 10);

        printArray(intArray);

    }

    private static void countingSort(int[] intArray, int min, int max) {
        int[] counting = new int[(max - min) + 1];

        for (int i = 0; i < intArray.length; i++) {
            counting[intArray[i] - min]++;
        }
        int j =0;
        for (int i = min ; i <= max; i++) {
            while (counting[i-min]-- > 0){
                intArray[j++] = i;
            }
        }
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
