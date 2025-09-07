public class ans {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < n; i++) {

            // profit = Math.max(profit, prices[i]-buy);
            // buy = Math.min(buy, prices[i]);

                    //OR

            if(buy > prices[i]) {
                buy = prices[i];
            }
            else if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String args[]) {
        ans obj = new ans();
        int arr[] = {7,1,5,3,6,4};
        int k = obj.maxProfit(arr);
        System.out.println(k);
    }
}
