package algorithm.array;

public class FindElementOccurredOnce {

    public static void main(String[] args) {
        int[] array = {6,2,3,4,3,2,6};
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            res = res ^ array[i];
        }
        System.out.println(res);
    }
}
