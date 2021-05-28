package datastructure.problem.array;

/**
 * You have an array of non-negative integers,you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index in O(n) Time complexity and O(1) Space Complexity
 */
public class LinearTimeApproachToSolveJumpGameProblem {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 8, 2, 6, 7, 6, 8, 9};
        int a = array[0];
        int b = array[0];
        int jump = 1;
        for (int i = 1; i < array.length; i++) {
            a--;
            b--;

            if (array[i] > b) {
                b = array[i];
            }

            if (a == 0) {
                jump++;
                a = b;
            }



        }
        System.out.println("Number of jumps : " + jump);
    }
}
