package datastructure.problem.array;

public class ArrayPuzzleOfSolvingCelebrityProblem {

    public static void main(String[] args) {
        int [][] matrix = {{0, 0, 1, 0},
                            {0, 0, 1, 0},
                            {0, 1, 0, 0},
                            {0, 0, 1, 0}
                    };

        int x = 0, y = matrix.length-1;
        while (x < y){
            if(matrix[x][y] == 1){
                x++;
            }else{
                y--;
            }
        }
        boolean isFound = true;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[x][i] != 0){
                System.out.println("There is no celebrity");
                isFound = false;
                break;
            }
        }
        if(isFound) {
            System.out.println("Celebrity found at position "+ (x+1));
        }
    }
}
