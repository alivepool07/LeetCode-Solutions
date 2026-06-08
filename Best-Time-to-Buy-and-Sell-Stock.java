1class Solution {
2    public int maxProfit(int[] prices) {
3        int min_price = Integer.MAX_VALUE;
4        int profit = 0;
5
6        for(int i =0; i< prices.length; i++){
7            if(prices[i] < min_price) min_price = prices[i];
8
9            int tempProfit = prices[i] - min_price;
10            if(tempProfit > profit) profit = tempProfit;
11        }
12        return profit;
13    }
14}