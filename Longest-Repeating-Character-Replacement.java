1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int[] fre = new int[26];
5        int ans = 0;
6        int maxLen = 0;
7
8        int l = 0, r = 0;
9
10        while(r < n) {
11            fre[s.charAt(r) - 'A']++;
12            ans = Math.max(ans , fre[s.charAt(r) - 'A']);
13
14            while ((r - l + 1) - ans > k) {
15                fre[s.charAt(l) - 'A']--;
16                l++;
17            }
18            maxLen = Math.max(maxLen , r-l+1);
19            r++;
20        }
21
22    return maxLen;
23    }
24}