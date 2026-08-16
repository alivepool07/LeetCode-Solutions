class Solution {
    public int rob(int[] nums) {

        // if(nums.length == 1) return nums[0];
        // if(nums.length == 0 || nums == null) return 0;
        
        int n = nums.length;
        
        int rob1 = 0;
        int rob2 = 0;

        for(int rob : nums) {
            int currMax = Math.max(rob1 + rob , rob2);
            rob1 = rob2;
            rob2 = currMax;
        }
 
        return rob2;
    }
}