class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 0;
        int i = n-1;
        while (i >= 0 && nums[i] > k) {
            int h = nums[i];
            while (i >= 0 && nums[i] == h){
                nums[i] = k;
                i--;
            }
            cnt++;
        }
        
        for (int num : nums) {
            if (num != k) {
                return -1;
            }
        }

        return cnt;
    }
}