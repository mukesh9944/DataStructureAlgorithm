package algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, -22, 35, -15, 7, 55, 1};

        for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        printArray(intArray);

    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

    private static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }
        int t = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = t;
    }
}
