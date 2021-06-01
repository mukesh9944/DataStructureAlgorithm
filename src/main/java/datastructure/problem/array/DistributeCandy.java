package datastructure.problem.array;

import java.util.Arrays;

public class DistributeCandy {
    public static void main(String[] args) {
        int[] ratings = {1, 5,2,1};

        int totalCandy = sumCandy(ratings, ratings.length);

        System.out.println("Total candy :"+ totalCandy);
    }

    private static int sumCandy(int[] ratings, int size) {
        int sum = 0;

        int[] left = new int[size];
        int[] right = new int[size];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < size-1; i++) {
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1] + 1;
            }
        }

        System.out.println("left"+ Arrays.toString(left));
        for (int i = size-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i+1] + 1;
            }
        }

        System.out.println("right"+ Arrays.toString(right));
        for (int i = 0; i < size; i++) {
            sum += Math.max(left[i], right[i]);
        }

        return sum;
    }
}
