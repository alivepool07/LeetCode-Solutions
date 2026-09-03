class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;

        int ans = 0;
        for(int num : stones) ans+= num;
        boolean[][] t = new boolean[n+1][ans+1];

        for(int i = 0; i< n+1; i++) {
            for(int j = 0; j < ans+1; j++) {
                if(i == 0) t[i][j] = false;
                if(j == 0) t[i][j] = true;
            }
        }

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < ans+1; j++ ){
                if(stones[i-1] <= j) {
                    t[i][j] = t[i-1][j-stones[i-1]] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        int res = Integer.MAX_VALUE;
        int half = ans/2;
        for(int s1 =0; s1 <= half; s1++) {
            if(t[n][s1]) {
                int s2 = ans - s1;
                res = Math.min(res, s2-s1);
            }
        }
        return res;
    }
}