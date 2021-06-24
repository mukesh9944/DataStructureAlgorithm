package datastructure.problem.array;

public class BinarySearchMethodToFindSquareRootOfAnElement {

    public static void main(String[] args) {
        int num = 15;
        int squareRoot = findSquareRoot(num);
        System.out.println(squareRoot);
    }

    private static int findSquareRoot(int num) {
        int res = 0;
        int start = 0;
        int end = num;
        while (start < end){
            int mid = (start + end) / 2;

            if(mid * mid == num){
                res = mid;
                break;
            }
            if(mid * mid < num){
                start = mid+1;
                res = mid;
            }else {
                end = mid-1;
            }
        }

        return res;
    }
}
