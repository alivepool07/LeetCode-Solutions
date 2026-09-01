class Solution {
    public int minDistance(String word1, String word2) {
        int ins = word1.length() - lcs(word1 , word2);
        int del = word2.length() - lcs(word1 , word2);

        return ins +del;
        
    }
    public int lcs(String s1 , String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] t = new int[501][501];
        for(int i =0; i < m+1; i++) {
            for(int j = 0; j< n+1; j++) {
                if(i == 0 || j == 0) t[i][j] = 0;
            }
        }
        for(int i = 1; i < m+1; i++) {
            for(int j = 1; j< n+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) t[i][j] = 1+ t[i-1][j-1];
                else {
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
}