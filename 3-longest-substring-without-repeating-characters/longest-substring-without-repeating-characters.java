class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int right = 0;
        int left = 0;
        int maxLen = 0;

        Map<Character , Integer> map = new HashMap<>();

        for (right = 0 ; right < n ; right++){
            char currChar = s.charAt(right);
            if(map.containsKey(currChar) && map.get(currChar) >= left) left = map.get(currChar) + 1;
            map.put(currChar , right);
            maxLen = Math.max(maxLen , right - left +1);
        }
        return maxLen;
    }
}