package algorithm.array;

import java.util.ArrayList;

public class StockBuyAndSell {
    public static void main(String[] args) {
        //int[] array = {98,178, 250, 300, 40, 540, 690};
        int[] array = {94,78, 32, 20, 39, 78, 12};
        ArrayList<Stock> result = new ArrayList<>();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            Stock stock = new Stock();

            while (i< n-1 && array[i+1] <= array[i]){
                i++;
            }
            if( i == n-1){
                break;
            }
            stock.buy = i++;

            while(i < n-1 && array[i+1] >= array[i]){
                i++;
            }
            stock.sell = i;
            result.add(stock);
          }
        int profit = 0;
        for (Stock stock: result
             ) {
            profit = profit + (array[stock.sell] - array[stock.buy]);
        }

        System.out.println("Maximum profit "+ profit);

    }
}

class Stock{
    int buy;
    int sell;
}
