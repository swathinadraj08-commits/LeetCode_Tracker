// Last updated: 7/30/2026, 12:04:20 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int minPrice = prices[0];   // Lowest price seen so far
5        int maxProfit = 0;          // Maximum profit
6
7        for (int i = 1; i < prices.length; i++) {
8
9            // If we find a lower price, update minPrice
10            if (prices[i] < minPrice) {
11                minPrice = prices[i];
12            }
13
14            // Calculate profit if we sell today
15            int profit = prices[i] - minPrice;
16
17            // Update maximum profit
18            if (profit > maxProfit) {
19                maxProfit = profit;
20            }
21        }
22
23        return maxProfit;
24    }
25}