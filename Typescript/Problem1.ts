function maxProfit(prices: number[]): number {
    let buy1 = -prices[0], buy2 = -prices[0];
    let profit1 = 0, total_profit = 0;

    for (const price of prices) {
        buy1 = Math.max(buy1, -price);
        profit1 = Math.max(profit1, price + buy1);
        buy2 = Math.max(buy2, profit1 - price);
        total_profit = Math.max(total_profit, price + buy2);
    }
    return total_profit;
};