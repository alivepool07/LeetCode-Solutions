1class Solution {
2    public int numberOfSubstrings(String s) {
3        int n = s.length();
4        int[] freq = new int[3];
5        int left = 0;
6        int ans = 0;
7
8        for (int right = 0; right < n; right++) {
9            freq[s.charAt(right) - 'a']++;
10
11            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
12                ans += (n - right);
13                freq[s.charAt(left) - 'a']--;
14                left++;
15            }
16        }
17        return ans;
18    }
19}