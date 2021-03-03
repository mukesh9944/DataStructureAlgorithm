package algorithm.searching;

public class MaximumValueInAnArrayOfIncreasingAndDecreasing {

    public static void main(String[] args) {
        //int[] array = {6, 9, 15, 25, 35, 50, 41, 29, 23, 8};
        //int[] array = {50};
        //int[] array = {23, 50};
        //int[] array = {50, 23, 22, 20, 12, 10, 5 , 2 ,1};
        int[] array = {1, 5, 8, 9, 11, 22, 45, 67, 87};
        int maxNumber = findMaximumValueInAnArray(array, 0, array.length - 1);
        System.out.println("Maximum number" + maxNumber);
    }

    private static int findMaximumValueInAnArray(int[] array, int low, int high) {

        if (low == high) {
            return array[low];
        }
        if (low + 1 == high) {
            if (array[low] >= array[high]) {
                return array[low];
            } else {
                return array[high];
            }
        }
        int mid = low + ((high - low) / 2);

        if (array[mid - 1] < array[mid] && array[mid] > array[mid + 1]) {
            return array[mid];
        } else if (array[mid - 1] > array[mid] && array[mid + 1] < array[mid]) {
            return findMaximumValueInAnArray(array, low, mid - 1);
        } else {
            return findMaximumValueInAnArray(array, mid + 1, high);
        }
    }
}
