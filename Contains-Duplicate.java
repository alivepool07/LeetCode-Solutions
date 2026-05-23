1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for(int i = 0; i < nums.length; i++) {
5            set.add(nums[i]);
6        }
7        if(set.size() == nums.length) return false;
8        else {
9            return true;
10        }
11    }
12}