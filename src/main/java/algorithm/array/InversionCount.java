package algorithm.array;

public class InversionCount {

    public static void main(String[] args) {
        int[] array = {9,1,6,4,5};
        //int[] tempArray = new int[array.length];
        int res = mergeSort(array, 0, array.length-1);
        System.out.println(res);
    }

    private static int mergeSort(int[] array, int left, int right) {
        int mid, inversionCount=0;
        if(right > left){
            mid = (right + left) / 2;
            inversionCount = mergeSort(array, left, mid);

            inversionCount = mergeSort(array, mid+1, right);

            inversionCount = merge(array, left, mid+1, right);
        }
        return inversionCount;
    }

    private static int merge(int[] array, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int inversionCount = 0;
        while (i < mid && j <= right) {
            if(array[i] > array[j]){

                inversionCount = inversionCount + (mid+1-i);
            }
            i++;
            j++;
        }
        return inversionCount;
    }
}
