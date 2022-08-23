package Algorithms_and_DS.DP;

public class BuySellStocks {


    public static void main(String[] args) {
        int [] prices = new int[]{3,2,6,5,0,3};
        System.out.println("Max profit is:"+ maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;int sell = 0;
        int profit = 0;

        for (int i = 0;i<prices.length-1;i++){
            if(prices[i]<=buy){
                buy = prices[i];
                sell = 0;
            }
            int j = i+1;

            if(prices[j]-buy >= profit){
                sell = prices[j];
            }
            profit = Math.max(profit,(sell-buy));

        }
        return profit ;

    }
}
