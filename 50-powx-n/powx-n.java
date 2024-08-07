class Solution {
    public double myPow(double x, int n) {
        

        //Iterative approach hai :)

        if(n == 0) return 1.0;
        long nTemp = n;
        if (n < 0) {
            x = 1 / x; 
            nTemp = -nTemp;
        }

        double ans = 1.0;
        while (nTemp > 0) {
            if (nTemp % 2 == 0) {
                x *= x;
                nTemp /= 2;
            } else {
                ans *= x;
                nTemp--;
            }
        }

        return ans;
    }
}