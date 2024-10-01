class Solution {
    public char kthCharacter(int k) {
        int size = 1;
        String str = "a";

        while (size < k) {
            String res = "";
            for(char c : str.toCharArray()) {
                char nxt = c == 'z' ? 'a' : (char)(c+1);
                res += (c+""+nxt);
            }
            size *= 2;
            str = new String (res);
        }
        return str.charAt(k-1);
    }
}