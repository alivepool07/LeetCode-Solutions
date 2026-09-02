class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int i = 0, j = 0;

        if(g.length == 0 || s.length == 0) return 0;

        while(i < g.length && j < s.length) {
            if(g[i] <= s[j] ) {
                child++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return child;
    }
}