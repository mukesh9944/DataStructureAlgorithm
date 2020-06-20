package algorithm.sorting;

public class InsertionSortUsingRecursion {
    public static void main(String[] args) {
        int[] intArray = {20, -22, 35, -15, 7, 55, 1};

        insertionRecursionSort(intArray, intArray.length);


        printArray(intArray);
    }

    private static void insertionRecursionSort(int[] intArray, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionRecursionSort(intArray, numItems - 1);

        int newElement = intArray[numItems-1];
        int i = numItems - 1;
        for (; i > 0 && intArray[i - 1] > newElement; i--) {
            intArray[i] = intArray[i - 1];
        }
        intArray[i] = newElement;

    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
