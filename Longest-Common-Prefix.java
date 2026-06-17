1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1 = strs[0];
5        String s2 = strs[strs.length - 1];
6        int i = 0;
7
8        while(i < s1.length() && i < s2.length()) {
9            if(s1.charAt(i) == s2.charAt(i)) i++;
10            else break;
11        }
12        return s2.substring(0,i);
13    }
14}