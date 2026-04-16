
public class maxProfit {

    public static int maxProfit(int[] prices) {
        return solve(prices, 0, false);
    }

    private static int solve(int[] prices, int day, boolean holding) {
        if (day == prices.length) return 0;

        if (holding) {
            int sell = prices[day] + solve(prices, day + 1, false);
            int skip = solve(prices, day + 1, true);
            return Math.max(sell, skip);
        } else {
            int buy = -prices[day] + solve(prices, day + 1, true);
            int skip = solve(prices, day + 1, false);
            return Math.max(buy, skip);
        }
    }

    public static void main(String[] args) {
        int[] prices = {9, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}