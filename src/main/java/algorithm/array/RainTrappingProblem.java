package algorithm.array;

public class RainTrappingProblem {
    public static void main(String[] args) {
        int[] array = {5,3,4,6,4,6};
        int s = array.length;
        int[] maxRight = new int[s];
        int[] maxLeft = new int[s];
        maxRight[s-1] = array[s-1];
        for (int i = array.length-2; i >= 0 ; i--) {
            maxRight[i] = array[i] > maxRight[i+1] ? array[i] : maxRight[i+1];
        }

        maxLeft[0] = array[0];
        for (int i = 1; i < s ; i++) {
            maxLeft[i] = array[i] > maxLeft[i-1] ? array[i] : maxLeft[i-1];
        }
        int result = 0;
        for (int i = 1; i < s-1; i++) {
            if(maxRight[i] < maxLeft[i]){
                result = result + (maxRight[i] - array[i]);
            }else{
                result = result + (maxLeft[i] - array[i]);
            }
        }
        System.out.println(result);
    }
}
