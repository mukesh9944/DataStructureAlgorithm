package datastructure.problem.array;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 0, 4, 0, 9};
        /*int low = 0, high = array.length - 1;

        while (low <= high) {
            if (array[high] == 0) {
                high--;
            } else if (array[low] == 0 && array[high] != 0) {

                int temp = array[high];
                array[high] = array[low];
                array[low] = temp;
                high--;
                low++;

            } else {
                low++;
            }
        }*/
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                array[count++] = array[i];
            }
        }
        while (count < array.length){
            array[count++] = 0;
        }


        System.out.println(Arrays.toString(array));
    }
}
