package datastructure.problem.array;

public class XorMethodToFindTheElementThatOccursOne {

    public static void main(String[] args) {
        int [] array = {6,2,4,3,4,2,3};
        int n = array.length;

        int res = findSingleElement(array, n);

        System.out.println(res);
    }


    private static int findSingleElement(int[] array, int n) {
        int res = array[0];

        for (int i = 1; i < n; i++) {
            res = res ^ array[i];
        }
        return res;
    }

}
