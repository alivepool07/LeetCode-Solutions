1class Solution {
2    public int[] finalPrices(int[] prices) {
3        int n = prices.length;
4        int[] result = new int[n];
5        Stack<Integer> stack = new Stack<>();
6
7        for (int i = n - 1; i >= 0; i--) {
8            while (!stack.isEmpty() && stack.peek() > prices[i]) {
9                stack.pop();
10            }
11
12            if (stack.isEmpty()) {
13                result[i] = prices[i];
14            } else {
15                result[i] = prices[i] - stack.peek();
16            }
17
18            stack.push(prices[i]);
19        }
20
21        return result;
22    }
23}