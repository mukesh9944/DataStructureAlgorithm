package datastructure.problem.array;

public class KthSmallestElementOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] first = {2, 3, 6, 7, 9};
        int[] second = {1, 4, 8, 10};
        int k = 5;
        System.out.println(findKthSmallestElement(first, 0, first.length - 1, second, 0, second.length - 1, k));
    }

    private static int findKthSmallestElement(int[] first, int start_f, int end_f, int[] second, int start_s, int end_s, int k) {

        int m1 = (start_f + end_f) / 2;
        int m2 = (start_s + end_s) / 2;

        if (start_f == end_f) {
            return first[k];
        }
        if (start_s == end_s) {
            return first[k];
        }
        if ((m1 + m2) < k) {
            if (first[m1] < second[m2]) {
                return findKthSmallestElement(first, m1 + 1, end_f, second, start_s, end_s, k - m1 - 1);
            } else {
                return findKthSmallestElement(first, start_f, end_f, second, m2 + 1, end_s, k - m2 - 1);
            }
        } else {
            if (first[m1] < second[m2]) {
                return findKthSmallestElement(first, start_f, end_f, second, m2, end_s, k);
            } else {
                return findKthSmallestElement(first, m1, end_f, second, start_s, end_s, k);
            }
        }

    }
}
