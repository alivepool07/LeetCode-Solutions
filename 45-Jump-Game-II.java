class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int cnt = 0, i = 0;
        int currEnd = 0;
        int far = 0;

        if(nums.length == 1)return 0;

        while (i < n-1) {
            far =  Math.max(far , i+nums[i]);

            if(i == currEnd) {
                cnt++;
                currEnd = far;
            }
            i++;
        }
       
        return cnt;
    }
}