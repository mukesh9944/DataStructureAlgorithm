package algorithm.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, -22, 35, -15, 7, 55, 1};

        long startTime = System.nanoTime();
        for (int lastUnsortedIndex = 1; lastUnsortedIndex < intArray.length; lastUnsortedIndex++) {
            int newElement = intArray[lastUnsortedIndex];
            int i = lastUnsortedIndex;
            for (; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by this algorithm :"+ (endTime-startTime));
        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
