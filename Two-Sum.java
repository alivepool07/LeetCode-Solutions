1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4
5        for(int i = 0; i < nums.length; i++) {
6            int compliment = target - nums[i];
7            if(map.containsKey(compliment)) {
8                return new int[] {map.get(compliment) , i};
9            }
10            else
11            map.put(nums[i] , i);
12        }
13        return null;
14    }
15}