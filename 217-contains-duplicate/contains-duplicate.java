class Solution {
    public boolean containsDuplicate(int[] nums) {
      int n = nums.length;
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], true);
            }
        }
        return false;
}
}