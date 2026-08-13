class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] arr =  new int[26];

        for(int x : s.toCharArray()) {
            arr[x - 'a']++;
        }
        for(int x : t.toCharArray()) {
            arr[x - 'a']--;
        }

        for(int x : arr) {
            if(x != 0) return false;
        }
        return true;
    }
}