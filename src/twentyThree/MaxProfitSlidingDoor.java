package twentyThree;

public class MaxProfitSlidingDoor {
    public int maxProfit(int[] prices) {
        // I believe this is a sliding door door, 2 pointer solution
        // Where we see if we can do any better
        // We will record current max profit in a variable
        // As long as the price is increasing we increase the second pointer
        // If it goes down, we jump the back pointer forward since we already exlored all those solutions
        int buy = 0;
        int maxProfit = 0;
        for (int sell = 1; sell < prices.length; sell++) {
            int currentProfit = prices[sell] - prices[buy];
            if (prices[buy] < prices[sell]) {
                maxProfit = Math.max(currentProfit, maxProfit);
            } else {
                buy = sell;
            }
        }
        return maxProfit;
    }
}
