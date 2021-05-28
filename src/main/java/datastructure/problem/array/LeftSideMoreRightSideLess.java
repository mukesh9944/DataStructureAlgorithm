package datastructure.problem.array;

/**
 * We have an array, we have to find an element before which all elements are less than it, and after which all are greater than it.
 * Finally, return the index of the element, if there is no such element, then return -1: Time complexity O(n) and Space Complexity O(n)
 */
public class LeftSideMoreRightSideLess {

    public static void main(String[] args) {
        int[] array = {6, 2, 5, 4, 7, 9, 11, 8, 10};
        int[] left = new int[array.length];
        left[0] = Integer.MIN_VALUE;
        int k = -1;
        for (int i = 1; i < array.length; i++) {
            left[i] = Math.max(left[i-1], array[i-1]);
        }
        int right = Integer.MAX_VALUE;
        for (int i = array.length -1 ; i >= 0; i--) {
            if(left[i] < array[i] && right > array[i]){
                k = i;
            }
            right = Math.min(right, array[i]);
        }
        System.out.println("The element is : "+ (k == -1 ? k : array[k]));
    }
}
