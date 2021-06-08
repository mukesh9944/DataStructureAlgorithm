package datastructure.problem.array;

public class LinearTimeApproachToSolveStockBuySellProblem {

    public static void main(String[] args) {
        //int [] array = {98, 178, 250, 300, 40, 540, 690};
        int[] array = {94, 78, 32, 20, 39, 78, 12};
        int totalProfit = 0;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int buy = 0;
            int sell = 0;

            while(i < n-1  && array[i+1] <= array[i]){
                i++;
            }
            if(i+1 > n){
                break;
            }
            buy = array[i];

            while(i < n-1  && array[i+1] >= array[i]){
                i++;
            }

            sell = array[i];

            totalProfit = totalProfit + (sell-buy);

        }

        System.out.println("total profit : "+totalProfit);
    }
}
