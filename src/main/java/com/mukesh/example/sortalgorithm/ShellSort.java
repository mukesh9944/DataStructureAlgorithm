package com.mukesh.example.sortalgorithm;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20, -22, 35, -15, 7, 55, 1};

        long startTime = System.nanoTime();
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                for (; j >= gap && intArray[j - gap] > newElement; j -= gap) {
                    intArray[j] = intArray[j - gap];
                }
                intArray[j] = newElement;
            }

        }
        long endTime = System.nanoTime();
        System.out.println("Time taken : "+ (endTime - startTime));

        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
