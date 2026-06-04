1class Solution {
2    public int maxArea(int[] height) {
3        int global_max = 0;
4        int i = 0;
5        int j = height.length - 1;
6
7        while( i < j) {
8            int max = (j-i) * Math.min(height[i] , height[j]);
9            global_max = Math.max(global_max , max);
10
11            if(height[i] < height[j]) i++;
12            else {
13                j--;
14            }
15        }
16        
17        return global_max;
18    }
19}