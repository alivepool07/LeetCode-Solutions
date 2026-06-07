1class Solution {
2    public boolean isHappy(int n) {
3        Set<Integer> visit = new HashSet<>();
4        
5        while (!visit.contains(n)) {
6            visit.add(n);
7            n = getNextNumber(n);
8            if (n == 1) {
9                return true;
10            }
11        }
12        
13        return false;
14    }
15
16    private int getNextNumber(int n) {
17        int output = 0;
18        
19        while (n > 0) {
20            int digit = n % 10;
21            output += digit * digit;
22            n = n / 10;
23        }
24        
25        return output;
26    }
27}