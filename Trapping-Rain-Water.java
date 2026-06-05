1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int cnt = 0;
5        int i = 0;
6        int j = n-1;
7        int leftMax = 0;
8        int rightMax = 0;
9
10        while (i < j) {
11            leftMax = Math.max(leftMax , height[i]);
12            rightMax = Math.max(rightMax , height[j]);
13
14            if(leftMax < rightMax) {
15                cnt += leftMax - height[i];
16                i++;
17            }
18            else{
19                cnt += rightMax - height[j];
20                j--;
21            }
22        }
23        return cnt;
24    }
25}