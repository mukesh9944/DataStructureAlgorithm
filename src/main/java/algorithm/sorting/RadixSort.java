package algorithm.sorting;

public class RadixSort {
    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(intArray, 10, 4);

        printArray(intArray);

    }

    private static void radixSort(int[] intArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(intArray, i, radix);
        }
    }

    private static void radixSingleSort(int[] intArray, int position, int radix) {
        int numItem = intArray.length;
        int[] countArray = new int[radix];

        for (int value : intArray) {
            countArray[getDigit(position, value, radix)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] tempArray = new int[numItem];

        for (int tempIndex = numItem - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getDigit(position, intArray[tempIndex], radix)]] = intArray[tempIndex];
        }

        for (int i = 0; i < numItem; i++) {
            intArray[i] = tempArray[i];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }


    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
