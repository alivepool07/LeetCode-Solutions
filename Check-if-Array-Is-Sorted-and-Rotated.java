1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length;
4        int cnt = 0;
5        for (int i = 0 ; i < n ; i++) {
6
7            if (nums[i] > nums[(i+1) % n]) {
8                cnt++;
9            }
10            if(cnt > 1) {
11                return false;
12            }
13        }
14        return true;
15    }
16}