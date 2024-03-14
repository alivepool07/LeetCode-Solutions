class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        if(n==1 && nums[i] == 1) {
            return 0;
        }
        else if (n==1 && nums[i]==0) {
            return 1;
        }
        else {
        Arrays.sort(nums);
        if(nums[i] != 0) {
            return 0;
        }

        for(int j = 1;  j < n ; j++) {

            if(nums[i] + 1 != nums[j])
                return i+1;
            
            i++;
        }

        }
      
        return i+1;
    }
}