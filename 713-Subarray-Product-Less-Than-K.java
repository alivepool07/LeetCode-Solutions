class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int n = nums.length;
        int l =0, m = 0, count = 0, max = 1;
        if( k <= 1) return 0;
        while(m<n) {
            
            max *= nums[m];
            while (max >= k) {
                max/= nums[l];
                l++;
            }
            count += (m-l+1);
            m++;
        }
        return count;
    }
}