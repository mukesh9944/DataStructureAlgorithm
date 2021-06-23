package datastructure.problem.array;

/*
    Kanade Algorithm
 */
public class MaximumSumSubArray {

    public static void main(String[] args) {
        int[] array = {-5, 6, -7, 1, 4, -8, 16};

        int res = maximumSubArray(array);
        System.out.println("maximum sum of sub array = "+res);
    }

    private static int maximumSubArray(int[] array) {
        int resultSum = Integer.MIN_VALUE;
        int intermediateSum = 0;

        for (int i = 0; i < array.length; i++) {

            intermediateSum = intermediateSum + array[i];

            if(intermediateSum < 0){
                intermediateSum = 0;
            }

            if(array[i] > intermediateSum){
                intermediateSum = array[i];
            }
            if(intermediateSum > resultSum){
                resultSum = intermediateSum;
            }

        }
        return resultSum;
    }
}
