1class Solution {
2    public double myPow(double x, int n) {
3        if(n == 0) return 1.0;
4        long nTemp = n;
5        if (n < 0) {
6            x = 1 / x; 
7            nTemp = -nTemp;
8        }
9
10        double ans = 1.0;
11        while (nTemp > 0) {
12            if (nTemp % 2 == 0) {
13                x *= x;
14                nTemp /= 2;
15            } else {
16                ans *= x;
17                nTemp--;
18            }
19        }
20
21        return ans;
22    }
23}