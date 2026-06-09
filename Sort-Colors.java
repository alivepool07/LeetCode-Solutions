1class Solution {
2    public void sortColors(int[] nums) {
3        int count0 = 0, count1 = 0, count2 = 0;
4        
5        for(int i = 0; i < nums.length; i++) {
6           if(nums[i] == 0) count0++;
7           else if(nums[i] == 1) count1++;
8           else if(nums[i] == 2) count2++;
9        }
10
11        int index = 0;
12        for(int i = 0; i < count0; i++) nums[index++] = 0;
13        for(int i = 0; i < count1; i++) nums[index++] = 1;
14        for(int i = 0; i < count2; i++) nums[index++] = 2;
15    }
16}