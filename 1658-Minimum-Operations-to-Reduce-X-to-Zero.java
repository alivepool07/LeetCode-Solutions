class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int left = 0, maxWindowSum = 0, maxLen = -1;
        int target = totalSum - x;
        for(int right = 0; right < n; right++) {
            maxWindowSum += nums[right];

            while (maxWindowSum > target && left <= right) {
                maxWindowSum -= nums[left];
                left++;
            }

            if(maxWindowSum == target) {
                maxLen = Math.max(maxLen , right - left +1);
            }
        }
        return maxLen != -1 ? n -maxLen : -1;
    }
}