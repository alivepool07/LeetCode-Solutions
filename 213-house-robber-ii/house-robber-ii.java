class Solution {

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0] , nums[1]);
// logic is take 0 se second last (n-1) element and 1 se n (last) element , phir jo v max ho whi loot lenge -_-
        return Math.max(solve(nums , 0 , nums.length-2) , solve(nums , 1 , nums.length-1));
    }
    private int solve(int[] nums , int start , int end) {
        

        int prev = 0;
        int nextPrev = 0;

        for(int num = start ; num <= end ; num++) {
            int temp = prev;
            prev = Math.max(prev , nums[num] + nextPrev);
            nextPrev = temp;

        }
        return prev;
    }
}