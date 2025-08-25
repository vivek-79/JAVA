public class DP_22_Max_Profit {
    public int maxProfit(int[] prices) {

        int min = 99_99_99;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
            ;
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        ;

        return profit;
    }
}
