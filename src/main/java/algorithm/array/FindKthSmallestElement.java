package algorithm.array;

public class FindKthSmallestElement {

    public static void main(String[] args) {
        int[] array = {54, 26, 17, 93, 77, 31, 44, 20, 55};

        int res = findKthElement(array, 0, array.length - 1, 7);

        System.out.println(res);
    }

    private static int findKthElement(int[] array, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            int index = divideArray(array, low, high);

            if(index-low == k-1){
                return array[index];
            }

            if(index-low > k-1){
                return findKthElement(array, low, index-1, k);
            }

            return findKthElement(array, index+1, high, k-index-low-1);
        }
        return -1;
    }

    private static int divideArray(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low;
        for (int j = low; j <= high ; j++) {
            if(array[j] < pivot){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[high];
        array[high] += temp;
        return i;
    }
}
