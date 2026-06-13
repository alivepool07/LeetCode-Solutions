1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4    Set<Character> set = new HashSet<>();
5    int n =  s.length();
6    int maxLen = 0, l = 0, r = 0, ans = 0;
7
8    while (r < n) { 
9
10        while(set.contains(s.charAt(r))) {
11            set.remove(s.charAt(l));
12            l++;
13        }
14        set.add(s.charAt(r));
15        maxLen = r-l+1;
16        ans = Math.max(ans , maxLen);
17        r++;
18        
19    }
20    return ans;
21    }
22}