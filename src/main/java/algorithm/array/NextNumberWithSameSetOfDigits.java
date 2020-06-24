package algorithm.array;

import java.util.Arrays;

/**
 * Write an algorithm to find out next greater number to given number with the same set of digits
 */
public class NextNumberWithSameSetOfDigits {

    public static void main(String[] args) {
        NextNumberWithSameSetOfDigits sameSetOfDigits = new NextNumberWithSameSetOfDigits();
        int[] nums = {2,5,8,7,6,1};
        sameSetOfDigits.nextImmediateGreaterNumber(nums);
        System.out.println("next greater number ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

    }

    private void nextImmediateGreaterNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(i = n -1 ; i > 0; i--){
            if(nums[i] > nums[i-1]){
                break;
            }
        }
        int element = nums[i-1];
        int min = i;
        for (int j = i+1 ; j < n ; j++) {
            if(nums[j] > element && nums[j] < nums[min]){
                min = j;
            }
        }
        int t = nums[i-1];
        nums[i-1] = nums[min];
        nums[min] = t;

        Arrays.sort(nums, i, n);
    }

}
