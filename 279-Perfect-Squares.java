class Solution {
    public int numSquares(int n) {
        int[] t = new int[n+1];

        for(int i = 0; i <= n; i++) t[i] = n+1;

        t[0] = 0;

        for(int i = 1; i <= n; i++) {
             for(int j = 1; j * j <= i; j++) {
                t[i] = Math.min(t[i] , t[i - j*j] +1 );
             }
        }
        return t[n];
    }
}