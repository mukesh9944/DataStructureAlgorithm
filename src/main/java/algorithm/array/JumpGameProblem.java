package algorithm.array;

/**
 * Array of integers given where each element represents the max number of steps that can be made forward from that element.
 * Write a algorithm to find the minimum number of jumps to reach the end of the array (starting from the first element).
 * ̥If an element is 0, then cannot move through that element
 */
public class JumpGameProblem {
    public static void main(String[] args) {
        JumpGameProblem gameProblem = new JumpGameProblem();
        int[] arr = {1, 3, 5, 8, 9, 2, 7, 6, 8, 9};
        int res = gameProblem.jump(arr);
        System.out.println("Number of jumps " + res);
    }

    private int jump(int[] arr) {
        int jump = 1;
        int a = arr[0];
        int b = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            a--;
            b--;
            if (arr[i] > b) {
                b = arr[i];
            }
            if (a == 0) {
                jump++;
                a = b;
            }
        }
        return jump;
    }

}
