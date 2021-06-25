package datastructure.problem.array;

public class BinarySearchMethodToFindMedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] first = {1, 6, 8, 10, 12};
        int[] second = {2, 3, 4, 9, 11};

        System.out.println(findMedianOfTwoSortedArray(first, 0, first.length - 1, second, 0, second.length - 1));
    }

    private static double findMedianOfTwoSortedArray(int[] first, int start_f, int end_f, int[] second, int start_s, int end_s) {

        if (end_f - start_f + 1 == 2 && end_s - start_s + 1 == 2) {
            return (Math.max(first[start_f], second[start_s]) + Math.min(first[end_f], second[end_s])) / 2;
        }

        int m1 = findMedian(first, start_f, end_f);
        int m2 = findMedian(second, start_s, end_s);

        int mid_f = (end_f + start_f) / 2;
        int mid_s =(end_s + start_s) / 2;

        if (m1 > m2) {
            return findMedianOfTwoSortedArray(first, start_f, mid_f, second, mid_s, end_s);
        } else {
            return findMedianOfTwoSortedArray(first, mid_f, end_f, second, start_s, mid_s);
        }

    }

    private static int findMedian(int[] array, int start, int end) {
        return array[(end + start) / 2];
    }
}
