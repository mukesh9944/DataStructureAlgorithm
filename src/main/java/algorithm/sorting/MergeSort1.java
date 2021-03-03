package algorithm.sorting;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] array = {8, 4, 3, 12, 25, 6, 13, 10, 2};
        int[] result = new int[array.length];
        mergeSort(array, result, 0, array.length - 1);
        for (int num:array) {
            System.out.print(num + ", ");
        }
    }

    private static void mergeSort(int[] array, int[] result, int low, int high) {
        if (high == low) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(array, result, low, mid);
        mergeSort(array, result, mid + 1, high);

        merge(array, result, low, mid, high);
    }

    private static void merge(int[] array, int[] result, int low, int mid, int high) {
        int k = low, i = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                result[k++] = array[i++];
            } else {
                result[k++] = array[j++];
            }
        }
        while (i <= mid) {
            result[k++] = array[i++];
        }
        while (j <= high) {
            result[k++] = array[j++];
        }

        for (i = low; i <= high; i++) {
            array[i] = result[i];
        }
    }
}
