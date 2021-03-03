package algorithm.array;

/**
 * Array consist of only 0's, 1's and 2's.
 * Write an algorithm to sort this array in O(n) time complexity with only one traversal.
 */
public class ArraySortInplace {
    public static void main(String[] args) {
        ArraySortInplace arraySortInplace = new ArraySortInplace();
        int[] arr = {2, 1, 1, 0, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        arraySortInplace.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else {
                mid++;
            }
        }

    }

    private void swap(int[] arr, int mid, int high) {
        int t = arr[high];
        arr[high] = arr[mid];
        arr[mid] = t;
    }
}
