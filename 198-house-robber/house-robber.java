class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];

        if(nums == null || n == 0) return 0;
        if(n == 1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);

        for(int i = 2 ; i < n ; i++) {
            dp[i] = Math.max(dp[i-1] , nums[i] + dp[i-2]); 
            // dp[i-1] ka mtlb hai ki us ghar ko nhi loot rhe
            // nums[i] ka mtlb hai loot rhe , aur agar loot rhe hai to add kro peechle loote hue maal me 
            // aur wo peechla hai dp[i-2] me coz second last ghar loote the. AB INHI KA MAX TO CHAHIYE :)
        }
        return dp[n-1];


    }
}