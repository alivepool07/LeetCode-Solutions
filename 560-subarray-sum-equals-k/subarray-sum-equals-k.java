class Solution {
    public int subarraySum(int[] nums, int k) {

     int n = nums.length;

     Map<Integer, Integer> map = new HashMap<>();
     
     int cnt = 0 , preSum = 0;

     map.put(0,1);

     for(int i = 0 ; i < n ; i++) {

        preSum += nums[i];

        int rem = preSum - k;

        cnt += map.getOrDefault(rem , 0);

        map.put(preSum , map.getOrDefault(preSum ,0) +1);
     }
    return cnt;
    }
}