class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        int max = 0;
        int i = 0;
        boolean ans = true;
        while(i < n) {
            if(i > max) {ans =  false; break;}
            
            max = Math.max(max, i + nums[i]);
            if( max >= n-1) {
                ans = true;
                break;
            }
            i++;
        }
        return ans;
    }
}