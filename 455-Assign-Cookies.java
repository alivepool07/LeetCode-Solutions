class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int childCount = 0;
        int cookie = 0;

        while(childCount < g.length && cookie < s.length) {

            if(g[childCount] <= s[cookie]) {
                childCount++;
            }
            cookie++;
        }
        return childCount;
    }
}