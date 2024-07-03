class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n = g.length;
        int m = s.length;
        int cnt = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0 ; i < n; i++) {

            while(j < m && s[j] < g[i]) {
                j++;
            }
            if(j<m) {
                cnt++;
                j++;
            }
            
        }
        return cnt;
    }
}