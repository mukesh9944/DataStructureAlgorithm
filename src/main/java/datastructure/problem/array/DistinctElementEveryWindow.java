package datastructure.problem.array;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementEveryWindow {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 4, 5, 3, 3, 4};
        int k = 3;
        distinctElement(array, k);
    }

    private static void distinctElement(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < k; i++) {

            if(map.get(array[i]) == null){
                map.put(array[i], 1);
                count++;
            } else {
                int c = map.get(array[i]);
                map.put(array[i], c+1);
            }
        }
        System.out.println(count);

        for (int i = k; i < array.length; i++) {

            if(map.get(array[i-k]) == 1){
                map.remove(array[i-k]);
                count--;
            }else{
                int c = map.get(array[i-k]);
                map.put(array[i-k], c-1);
            }

            if(map.get(array[i]) == null){
                map.put(array[i], 1);
                count++;
            }else{
                int c = map.get(array[i]);
                map.put(array[i], c+1);
            }
            System.out.println(count);
        }

    }
}
