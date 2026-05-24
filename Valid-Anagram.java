1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] arr = new int[26];
4        if(s.length() != t.length()) return false;
5
6        for(int i =0; i < s.length(); i++ ){
7            arr[s.charAt(i) - 'a']++;
8            arr[t.charAt(i) - 'a']--;
9
10        }
11        for(int v : arr){
12            if(v != 0) return false;
13        }
14        return true;
15    }
16}