1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        for(int i= 0; i < nums.length; i++) {
4            nums[i] = nums[i] * nums[i];
5        }
6        Arrays.sort(nums);
7        return nums;
8     }
9}