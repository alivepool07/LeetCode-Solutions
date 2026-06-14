1class Solution {
2    public int findPeakElement(int[] nums) {
3
4
5        int n  = nums.length;
6        int ans = 0;
7        int max = 0;
8
9        if(nums[0] > nums[n-1]) {
10            max  = nums[0];
11            ans = 0;
12        }
13        else {
14            max = nums[n-1];
15            ans = n-1;
16        }
17
18        for(int i = 1; i < n-1; i++) {
19            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
20                max = Math.max(max , nums[i]);
21                ans = i;
22            }
23        }
24        return ans;
25    }
26}