package com.leetcode.arraysandhashing;

// TODO: DO THIS AGAIN YOURSELF - THIS SOLUTION IS COPIED
public class BuySellStock {
    private BuySellStock() {
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
