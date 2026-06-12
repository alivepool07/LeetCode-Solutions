1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int maxLen = 0;
4        int ans = 0, l = 0, r =0 , count = 0;
5
6        while (r < nums.length) {
7            if(nums[r] == 0) count++;
8            
9            if (count > k) {
10                if(nums[l] == 0) count--;
11                l++;
12            }
13            if(count <= k) {
14                maxLen = r-l+1;
15                ans = Math.max(ans, maxLen);
16            }
17            r++;
18        }
19        return ans;
20    }
21}