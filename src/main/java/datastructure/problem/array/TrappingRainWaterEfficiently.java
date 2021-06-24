package datastructure.problem.array;

public class TrappingRainWaterEfficiently {

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 6, 3, 6};
        int n = array.length;
        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];

        maxRight[n-1] = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], array[i]);
        }

        maxLeft[0] = array[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1],array[i]);
        }

        int result = 0;
        for (int i = 1; i < n-1; i++) {
            result = result + (Math.min(maxLeft[i], maxRight[i]) - array[i]);

        }
        System.out.println(result);
    }
}
