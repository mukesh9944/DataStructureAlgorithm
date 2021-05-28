package datastructure.problem.array;

import java.util.Arrays;

/**
 * Write an algorithm to find out next greater number to given number with the same set of digits
 */
public class DigitRearrangementMethodToFindNextGreaterNumberWithSameSetOfDigits {

    public static void main(String[] args) {
        //int[] nums = {2, 1, 8, 7, 6, 5};
        //int[] nums = {5, 3, 6, 9, 7, 4};
        int[] nums = {1, 2, 3, 4, 5, 6};
        int j = 0;
        int k = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > nums[i-1]){
                j = i;
                if(nums[k] > nums[i-1]) {
                    int t = nums[i - 1];
                    nums[i - 1] = nums[k];
                    nums[k] = t;
                }
                break;
            }
        }
        Arrays.sort(nums, j, nums.length);

        System.out.println(Arrays.toString(nums));
    }
}
