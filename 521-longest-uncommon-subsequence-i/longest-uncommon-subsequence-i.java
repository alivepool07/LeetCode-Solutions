class Solution {
    public int findLUSlength(String a, String b) {
        if(!a.equals(b)){
            return a.length()>b.length()?a.length():b.length();
        }
        return -1;
    }
}