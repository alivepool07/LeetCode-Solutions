class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int cnt =0 , currSum =0;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int check = currSum - k;

            if(map.containsKey(check)) cnt += map.get(check);
            map.put(currSum , map.getOrDefault(currSum , 0) + 1);
        }
        return cnt;
    }
}