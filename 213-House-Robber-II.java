class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 2) return Math.max(nums[0] , nums[1]);
        return Math.max(solve(nums , 0 , n-2) , solve(nums , 1 , n-1));
        
    }
    private int solve(int[] nums, int start, int end) {
        
        int n = nums.length;
        int rob1 = 0;
        int rob2 = 0;

        for(int i = start; i <= end ; i++) {
            int currMax = Math.max(rob1 + nums[i] , rob2);
            rob1 = rob2;
            rob2 = currMax;
        }
        return rob2;
    }
}