class Solution {

    private long MOD = 1000000007;
    public int countGoodNumbers(long n) {

        long even = (n+1)/2;
        long odd = n/2;
        long first = pwr( 5 , even)% MOD;
        long second = pwr(4 , odd)% MOD;

        return (int) ((first  *  second)% MOD);
        
    }
    public long pwr(long x , long n ) {

        if(n == 0) return 1;
        long temp = pwr(x , n/2);

        if(n %2 == 0) return (temp * temp ) % MOD;  
        else return (x * temp * temp) % MOD;
    }
}