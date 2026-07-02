1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        
4        int n = score.length;
5        
6        int[][] sortedPairs = new int[n][2];
7        for (int i = 0 ; i < n ; i++) sortedPairs[i] = new int[] {i, score[i]};
8        
9        Arrays.sort(sortedPairs, (x, y) -> (y[1] - x[1]));
10        
11        String[] ans = new String[n];
12        
13        for (int i = 0 ; i < n ; i++) {
14            
15            if (i == 0) {
16                ans[sortedPairs[i][0]] = "Gold Medal";
17            } else if (i == 1) {
18                ans[sortedPairs[i][0]] = "Silver Medal";
19            } else if (i == 2) {
20                ans[sortedPairs[i][0]] = "Bronze Medal";
21            } else {
22                ans[sortedPairs[i][0]] = String.valueOf(i+1);
23            }
24        }
25        
26        return ans;
27    }
28}