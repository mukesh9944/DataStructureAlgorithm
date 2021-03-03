package algorithm.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        TowerOfHanoi toi = new TowerOfHanoi();
        int n = 3;
        toi.generateTOH(n, 1, 2, 3);
    }

    private void generateTOH(int n, int A, int B, int C) {

        if (n > 0) {
            generateTOH(n - 1, A, C, B);
            System.out.println("Move a disc from " + A + " to " + C);
            generateTOH(n - 1, B, A, C);
        }
    }
}
