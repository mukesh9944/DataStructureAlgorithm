package com.mukesh.searching;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 11;
        int low = 0;
        int high = array.length - 1;
        BinarySearch bs = new BinarySearch();
        int pos = bs.binarySearch(array, key, low, high);
        if(pos == -1){
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at position " + pos);
        }

    }

    private int binarySearch(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) / 2);
        if (array[mid] == key) {
            return mid;
        } else if (key < array[mid]) {
           return binarySearch(array, key, low, mid - 1);
        } else {
           return binarySearch(array, key, mid + 1, high);
        }
    }
}
