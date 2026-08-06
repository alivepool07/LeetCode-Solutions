class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> res = new HashSet<>();
        int n = s.length();
        int maxLen = 0, l = 0, r = 0;

        while(r < n) {

            while(res.contains(s.charAt(r))){
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(r));
            int max = r-l+1;
            maxLen = Math.max(max , maxLen);
            r++;
        }
        return maxLen;
    }
}