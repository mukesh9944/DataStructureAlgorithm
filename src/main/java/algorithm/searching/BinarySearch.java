package algorithm.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};

        BinarySearch bs = new BinarySearch();
        int position = bs.binSearch(arr, 8);

        System.out.println("Found at position :" + (position+1));

    }

    private int binSearch(int[] arr, int key) {
        int l = 1;
        int h = arr.length;
        while (l < h) {
            int mid = (l + h) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


}
