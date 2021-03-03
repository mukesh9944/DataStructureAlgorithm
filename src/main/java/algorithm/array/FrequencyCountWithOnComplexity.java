package algorithm.array;

public class FrequencyCountWithOnComplexity {

    public static void main(String[] args) {
        int[] array = {5,2,7,7,5,5,2};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i]--;
        }
        for (int i = 0; i < n; i++) {
            array[array[i] % n] = n + array[array[i] % n];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + " "+ array[i]/n);
        }
    }
}
