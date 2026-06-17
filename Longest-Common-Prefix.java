1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1 = strs[0];
5        String s2 = strs[strs.length - 1];
6        int i = 0;
7        while(i < s1.length() && i < s2.length()) {
8            if(s1.charAt(i) == s2.charAt(i)) i++;
9            else break;
10        }
11        return s2.substring(0,i);
12    }
13}