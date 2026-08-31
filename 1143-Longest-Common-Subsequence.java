class Solution {

    // static int[][] t = new int[1001][1001];
    

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] t = new int[m+1][n+1];
        for(int i = 0; i< m+1 ; i++) {
            for(int j = 0; j < n+1; j++) {
                if(i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for(int i = 1; i < m+1 ; i++) {
            for(int j =1 ; j < n+1; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) t[i][j] = 1+ t[i-1][j-1];

                else {
                    t[i][j] = Math.max(t[i][j-1] , t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
    // public int lcs(String text1 , String text2, int m , int n) {
    //     for(int i = 0 ; i < 1001; i++) Arrays.fill(t[i] , -1);
    //     if(n == 0 || m == 0) return 0;
    //     if(t[n][m] != -1) return t[n][m];


    //     if(text1.charAt(m-1) == text2.charAt(n-1)) return t[m][n] = 1+ lcs(text1, text2, m-1, n-1);

    //     else {
    //         return t[m][n] = Math.max(lcs(text1, text2, m, n-1) , lcs(text1, text2 , m-1 , n));
    //     } 
    // }
}