package datastructure.problem.array;

public class SearchAnElementInASortedAndRotatedArray {

    public static void main(String[] args) {
        //int[] array = {3, 4, 5, 6, 7, 8, 9 ,10, 1, 2};
        int[] array = {7, 8, 9 ,10, 1, 2, 3, 4, 5, 6};
        int num = 5; //1

        int index = findNumber(array, 0, array.length-1, num);

        System.out.println("Element found at index "+index);

    }

    private static int findNumber(int[] array, int start, int end, int value) {
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;

        if(array[mid] == value){
            return mid;
        }

        if(array[start] <= array[mid]){

            if(value >= array[start] && value <= array[mid]){
             return findNumber(array, start, mid -1, value);
            }

            return findNumber(array, mid+1, end, value);
        }

        if(value >= array[mid] && value <= array[end]){
            return findNumber(array, mid+1, end, value);
        }

        return findNumber(array, start, mid-1, value);

    }
}
