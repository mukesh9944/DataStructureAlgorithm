package algorithm.searching;

/**
 * We rotate an ascending order sorted array at some point unknown to user.
 * So for instance, 3 4 5 6 7 might become 5 6 7 3 4.
 * Modify binary search algorithm to find an element in the rotated array in O(log n) time and O(1) Space complexity
 */
public class SearchElementInSortedRotatedArray {

    public static void main(String[] args) {
        //int[] array = {5, 6, 7, 3, 4};
        //int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
        int[] array = {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        int key = 10;
        int pos = findElementInSortedRotatedArray(array, key, 0, array.length - 1);
        System.out.println("Element found at position " + pos);
    }

    private static int findElementInSortedRotatedArray(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);

        if (array[mid] == key) {
            return mid;
        }
        if (array[low] <= array[mid]) {
            if (key >= array[low] && key <= array[mid]) {
                return findElementInSortedRotatedArray(array, key, low, mid - 1);
            } else {
                return findElementInSortedRotatedArray(array, key, mid + 1, high);
            }
        } else {
            if (key >= array[mid] && key <= array[high]) {
                return findElementInSortedRotatedArray(array, key, mid + 1, high);
            } else {
                return findElementInSortedRotatedArray(array, key, low, mid - 1);
            }

        }
    }
}
