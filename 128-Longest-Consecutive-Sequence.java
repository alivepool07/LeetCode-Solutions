class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i : nums) {
            set.add(i);
        }
        int maxCount = 0;
        for(int i : set) {
            if(!set.contains(i-1)) {
                int curr = i;
                int currStreak = 1;
            
            while(set.contains(curr+1)) {
                curr++;
                currStreak++;
            }
            
            maxCount = Math.max(maxCount , currStreak);
        }
    }
        return maxCount;
    }
}