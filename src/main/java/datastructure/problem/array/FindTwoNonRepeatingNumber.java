package datastructure.problem.array;

public class FindTwoNonRepeatingNumber {

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 9, 2, 4, 3, 3};
        int n = array.length;

        findTwoNonRepeatingNumber(array, n);
    }

    private static void findTwoNonRepeatingNumber(int[] array, int n) {
        int res = array[0];

        for (int i = 1; i < n; i++) {
            res = res ^ array[i];
        }
        int most_rightBit = res & ~(res - 1);

        int firstNumber = 0, secondNumber = 0;
        for (int i = 0; i < n; i++) {

            int x = array[i];
            if ((x & most_rightBit) != 0) {
                firstNumber ^= x;
            } else {
                secondNumber ^= x;
            }
        }

        System.out.println(firstNumber + "----" + secondNumber);
    }
}
