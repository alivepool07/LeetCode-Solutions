class Solution {
    public int searchInsert(int[] nums, int target) {
       int n = nums.length;
       int l = 0;
       int h = n-1;

       return binSearch(nums, l , h ,target);

    }
    public static int binSearch(int[] nums , int l , int h , int target) {

        if (l <= h ) {

            int mid = l + (h - l) /2;
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
               return binSearch(nums ,l , mid -1 , target);
            }
            else {
                return binSearch(nums, mid + 1, h , target);
            }
        }

      return l;
    }
}