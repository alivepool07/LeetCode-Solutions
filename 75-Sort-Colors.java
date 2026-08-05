class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = 0;

        while (k <= j) {

            if(nums[k] == 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
                k++;
            }
            else if(nums[k] == 2) {

                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
                
            }
            else {
                k++;
            }
        
        }
    }
}