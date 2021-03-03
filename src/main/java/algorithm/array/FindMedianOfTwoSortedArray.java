package algorithm.array;

/**
 * There are two sorted arrays A and B of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n))
 */
public class FindMedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] first = {1,6,8,10,12};
        int[] second = {2,3,4,9,11};

       double res =  findMedian(first, 0, first.length-1, second, 0, second.length-1);

        System.out.println(res);
    }

    private static double findMedian(int[] first, int start_f, int end_f, int[] second, int start_s, int end_s) {

        if(end_f-start_f+1 == 2 && end_s-start_s+1 == 2){
            double x = Math.max(first[start_f], second[start_s]);
            double y = Math.min(first[end_f], second[end_s]);

            return (x+y) / 2;
        }
        int mid_f = (start_f + end_f)/2;
        int mid_s = (start_s + end_s)/2;

        if(first[mid_f] > second[mid_s]){
            return findMedian(first, start_f, mid_f, second, mid_s, end_s);
        }else{
            return findMedian(first, mid_f, end_f, second, start_s, mid_s);
        }

    }
}
