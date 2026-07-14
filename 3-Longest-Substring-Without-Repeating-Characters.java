class Solution {
    public int lengthOfLongestSubstring(String s) {

    Set<Character> set = new HashSet<>();
    int n =  s.length();
    int maxLen = 0, l = 0, r = 0, ans = 0;

    while (r < n) { 

        while(set.contains(s.charAt(r))) {
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        maxLen = r-l+1;
        ans = Math.max(ans , maxLen);
        r++;
        
    }
    return ans;
    }
}