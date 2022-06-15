class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i + 1 < prices.length; i++) {
            if ((prices[i + 1] - prices[i]) > 0) {
                profit += prices[i + 1] - prices[i];
                i++;
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int prices[] = { 1, 2, 3, 4, 5 };
        System.out.println(solution.maxProfit(prices));
    }

}
