public class BuySellStockII {
     public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        int totprofit = 0;
        for(int i = 0; i < n; i++) {
            if(buy < prices[i]) {
                profit = prices[i] - buy;
                totprofit += profit; 
            }
            buy = prices[i];
        }
        return totprofit;
    }

    public static void main(String[] args) {
        BuySellStockII obj = new BuySellStockII();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}