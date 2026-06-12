1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        
4        int ans = 0;
5        int maxLen = 0;
6
7        for(int i = 0; i < nums.length; i++) {
8            int zeros = 0;
9
10            for(int j = i; j < nums.length; j++) {
11                if(nums[j] == 0) {
12                    zeros++;
13                }
14                // else j++;
15
16                if(zeros > k){
17                    break;
18                }
19
20                maxLen = j-i+1;
21                ans = Math.max(maxLen, ans);
22            }
23            
24        }
25        return ans;
26    }
27}