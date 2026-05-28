1class Solution {
2    public int maxProduct(int[] nums) {
3        int currMax = nums[0];
4        int currMin = nums[0];
5
6        int ans = currMax;
7
8        for(int i = 1; i< nums.length; i++) {
9
10            if(nums[i] < 0) {
11                int temp = currMax;
12                currMax = currMin;
13                currMin = temp;
14            }
15
16            currMax = Math.max(nums[i] , currMax * nums[i]);
17            currMin = Math.min(nums[i], currMin * nums[i]);
18
19            ans = Math.max(ans , currMax);
20
21        }
22        return ans;
23    }
24}