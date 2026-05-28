1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int[] left = new int[nums.length];
5        int[] right = new int[nums.length];
6        
7        left[0] = 1;
8        for(int i = 1; i < nums.length; i++) {
9            left[i] = left[i-1] * nums[i-1];
10        }
11
12        right[nums.length - 1] = 1;
13        for(int i = nums.length - 2; i > -1; i--) {
14            right[i] = right[i+1] * nums[i+1];
15        }
16
17
18        for(int i = 0; i < nums.length; i++) {
19            nums[i] = left[i] * right[i];
20        }
21        return nums;
22    }
23}