class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0], buy2 = -prices[0];
        int profit1 = 0, total_profit = 0;

        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            profit1 = Math.max(profit1, price + buy1);
            buy2 = Math.max(buy2, profit1 -price);
            total_profit = Math.max(total_profit, price + buy2);
        }
        return total_profit;
    }
}