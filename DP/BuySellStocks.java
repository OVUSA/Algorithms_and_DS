package Algorithms_and_DS.DP;

public class BuySellStocks {


    public static void main(String[] args) {
        int [] prices = new int[]{7,1,5,3,6,4};
        System.out.println("Max profit is:"+ maxProfit(prices));

    }

    // two pointer technic doesn't quiet work
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        int i =0;
        int j = prices.length-1;
        while(i<=j){
            buy = Math.min(buy,prices[i]);
            i++;
            sell = Math.max(sell,prices[j]);
            j--;
        }
        int res = sell -buy;
        return res<0?0:res;
    }
}
