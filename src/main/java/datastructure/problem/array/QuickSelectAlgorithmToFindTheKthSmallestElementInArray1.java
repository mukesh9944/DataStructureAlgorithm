package datastructure.problem.array;

public class QuickSelectAlgorithmToFindTheKthSmallestElementInArray1 {

    public static void main(String[] args) {
        int[] intArray = {54, 26, 93, 17, 77, 31, 44, 20, 55};

        int kthElement = 2;
        printArray(intArray);

        System.out.println("\n Smallest kth element = "+findKthElementUsingQuickSort(intArray, 0, intArray.length-1, kthElement));
        printArray(intArray);
    }

    private static int findKthElementUsingQuickSort(int[] array, int start, int end, int k) {
        if (k > 0 && k <= end - start + 1) {
            int pivotIndex = partition(array, start, end);
            if (pivotIndex - start == k - 1) {
                return array[pivotIndex];
            } else if (pivotIndex - start < k - 1) {
                return findKthElementUsingQuickSort(array, pivotIndex + 1, end, k - pivotIndex + start -1);
            } else {
                return findKthElementUsingQuickSort(array, start, pivotIndex - 1, k);
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int j = start;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                int t = array[j];
                array[j] = array[i];
                array[i] = t;
                j++;
            }
        }
        int t = array[j];
        array[j] = array[end];
        array[end] = t;

        return j;
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
