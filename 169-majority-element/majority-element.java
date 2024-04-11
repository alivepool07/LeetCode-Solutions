class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele= n/2;
        for(int i = 0 ; i < n ; i++) {
            int cnt = 0;
            for(int j = i ; j < n ; j++) {
                if(nums[j] == nums[i] ) {

                    cnt++;
                }
            } 

            if(cnt > ele){
                // ele = nums[i];
                return nums[i];
            }
            
        }
        return -1;
    }
}