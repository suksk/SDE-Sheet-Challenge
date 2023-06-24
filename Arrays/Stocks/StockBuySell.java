class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        int maxProf = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            profit = prices[i] - min;
            if (profit > maxProf) {
                maxProf = profit;
            }

        }
        return maxProf;

    }
}