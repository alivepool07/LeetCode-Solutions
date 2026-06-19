1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low = 0;
4        int n  = nums.length;
5        int high = n-1;
6
7        return binarySearch(nums, low, high, target);
8    }
9     public static int binarySearch(int[] nums , int l , int h , int target) {
10
11        if (l <= h ) {
12
13            int mid = l + (h - l) /2;
14            
15            if(nums[mid] == target) {
16                return mid;
17            }
18            else if(nums[mid] > target) {
19               return binarySearch(nums ,l , mid -1 , target);
20            }
21            else {
22                return binarySearch(nums, mid + 1, h , target);
23            }
24        }
25
26      return l;
27     }
28}