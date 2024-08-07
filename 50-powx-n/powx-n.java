class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1.0;
        int tempN = n;

        if(n < 0) {
            tempN = -tempN;
            return 1/powRecursive(x , tempN);
        }
        return powRecursive(x ,n);
    }

    public double powRecursive(double x , int n) {

        //base conditions

        if(n == 0) return 1;
        if(n == 1) return x;

        double halfPow =  powRecursive(x , n/2);

        if(n % 2 == 0) return halfPow * halfPow;

        else 
        {
            return  halfPow * halfPow * x;
            }
    }
}