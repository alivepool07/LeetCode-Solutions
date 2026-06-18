1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int ans = 0;
4        int xor = start ^ goal;
5
6        while(xor != 0) {
7            ans += xor & 1;
8            xor >>= 1;
9        }
10        return ans;
11    }
12}