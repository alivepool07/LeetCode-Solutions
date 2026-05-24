1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4         char[] sChar = s.toCharArray();
5         char[] tChar = t.toCharArray();
6         Arrays.sort(sChar);
7         Arrays.sort(tChar);
8
9         if(Arrays.equals(sChar,tChar)) return true;
10         else
11         return false;
12    }
13}