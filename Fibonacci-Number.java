1class Solution {
2    public int fib(int n) {
3
4        if(n==0){
5            return 0;
6        }
7        if (n==1){
8            return 1;
9
10        }
11
12        int sum = fib(n-1) + fib(n-2);
13        return sum;
14    }
15}