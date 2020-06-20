package algorithm.searching;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
        RecursiveBinarySearch binarySearch = new RecursiveBinarySearch();
        int pos  = binarySearch.recursiveBinSearch(arr, 1, arr.length, 42);
        System.out.println("Found at position at "+ pos);
    }

    private int recursiveBinSearch(int[] arr, int l, int h, int key) {

        if(l == h){
            if(arr[l] == key){
                return l;
            }else{
                return -1;
            }
        }else {
            int mid = (l+h) / 2;

            if(key == arr[mid]){
                return  mid+1;
            }

            if(key < arr[mid]){
                return recursiveBinSearch(arr, l, mid-1, key);
            }else{
                return recursiveBinSearch(arr, mid+1, h, key);
            }
        }
    }
}
