1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int i = 0;
5        int j = n -1;
6
7        while (i <= j) {
8            int mid = i + ((j-i) /2);
9
10            if(nums[mid] == target) return mid;
11            else if(nums[mid] < target) i = mid+1;
12            else j = mid-1;
13        }
14    return -1;
15    }
16}