package algorithm.sorting;

public class RadixStringSort {
    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 26, 5);

        printArray(stringsArray);

    }

    private static void radixSort(String[] stringArray, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(stringArray, i, radix);
        }
    }

    private static void radixSingleSort(String[] stringArray, int position, int radix) {
        int numItem = stringArray.length;
        int[] countArray = new int[radix];

        for (String value : stringArray) {
            countArray[getIndex(position, value)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        String[] tempArray = new String[numItem];

        for (int tempIndex = numItem - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getIndex(position, stringArray[tempIndex])]] = stringArray[tempIndex];
        }

        for (int i = 0; i < numItem; i++) {
            stringArray[i] = tempArray[i];
        }
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }


    private static void printArray(String[] stringsArray) {
        for (String s : stringsArray) {
            System.out.println(s);
        }
    }

}
