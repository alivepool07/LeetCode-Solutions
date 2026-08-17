class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            int singleD = Integer.parseInt(s.substring(i-1, i));
            int doubleD = Integer.parseInt(s.substring(i-2 , i));

            if(singleD >= 1 && singleD <= 9) dp[i] += dp[i-1];

            if(doubleD >= 10 && doubleD <= 26) dp[i] += dp[i-2];
            }
        return dp[n];
    }
}





































