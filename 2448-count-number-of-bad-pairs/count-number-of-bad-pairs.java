class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        long goodPairs = 0;
        for (int i = 0; i < n; i++) {
            int diff = i - nums[i];
            countMap.put(diff, countMap.getOrDefault(diff, 0) + 1);
        }
        for (long cnt : countMap.values()) {
            goodPairs += cnt * (cnt - 1) / 2;
        }
        long totalPairs = (long) n * (n - 1) / 2;
        return totalPairs  - goodPairs;  
   }
   }
