class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        int currentSum= 0;

        for(int i = 0; i< nums.length; i++) {
            currentSum += nums[i];

            int rem = currentSum % k;

            if(map.containsKey(rem)) {
                int oldIndex = map.get(rem);
                if(i - oldIndex >= 2) {
                    return true;
                }  
            }
            else{
                    map.put(rem, i);
                }
        }
        return false;
    }
}