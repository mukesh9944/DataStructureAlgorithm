package datastructure.problem.array;

public class MaximumValueOfArrayIAndArrayJ {

    public static void main(String[] args) {
        int[] array = {35, 9, 12, 3, 2, 70, 31, 33, 1};
        int n = array.length;

        int[] left = new int[n];
        int[] right = new int[n];

        right[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = array[i] < array[right[i + 1]] ? right[i + 1] : i;
        }

        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = array[i] > array[left[i - 1]] ? left[i - 1] : i;
        }

        int i = 0, j = 0, res = 0;
        while (j < n && i < n) {
            if (array[left[i]] < array[right[j]]) {
                res = Math.max(res, right[j] - left[i]);
                j++;
            } else {
                i++;
            }
        }
        System.out.println(res);
    }

}
