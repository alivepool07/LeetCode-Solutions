class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k = nums.length;
        int[] p_nums = new int[k/2];
        int[] n_nums = new int[k/2];
     
        int u= 0;
        int y = 0;
        for(int i = 0 ; i < k ; i++) {
           
            if(nums[i] < 0 ) {
                n_nums[u++] = nums[i];
            }
            else {
                p_nums[y++] = nums[i];
            }
        }

        //Merging
        int p = 0;
        int n = 0;
        for(int i = 0 ; i < k; i++) {

            if(i % 2 == 0) {
                nums[i] = p_nums[p++];
            }
            else {
                nums[i] = n_nums[n++];
            }
        }
        return nums;
    }
}