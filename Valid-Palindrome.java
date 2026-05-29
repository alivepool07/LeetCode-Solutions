1class Solution {
2    public boolean isPalindrome(String s) {
3        
4
5        if(s.isEmpty()) return true;
6
7        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
8
9        int left = 0;
10        int right = s.length()-1;
11
12        while (left < right) {
13
14            if(s.charAt(left) != s.charAt(right)) return false;
15
16            left++;
17            right--;
18        }
19        return true;
20    }
21}