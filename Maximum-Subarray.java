1class Solution {
2    public int maxSubArray(int[] nums) {
3        long max = Long.MIN_VALUE;
4        long sum = 0;
5
6        for (int i =0; i<nums.length; i++){
7            sum += nums[i];
8
9            if(sum > max) max = sum;
10
11            if(sum < 0) sum = 0;
12        }
13
14        return (int) max;
15    }
16}