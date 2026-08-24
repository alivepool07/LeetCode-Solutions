class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int cnt = 0;
        for(String s : words) {
            if(s.length() >= n && s.startsWith(pref)) cnt++;
        }
        return cnt;
    }
}