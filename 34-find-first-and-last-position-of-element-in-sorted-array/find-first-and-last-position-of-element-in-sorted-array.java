class Solution {
    public int[] searchRange(int[] nums, int target) {
        // bhot jaayde brute force 
        int[] arr = {-1,-1};
       
        int n = nums.length;

        for(int i = 0 ; i < n ; i++) {

            if(nums[i] == target) {
                
                    if(arr[0] == -1){
                        arr[0] = i;
                    }
                
            arr[1] = i;
               
            }


        }
        return arr;
    }
}