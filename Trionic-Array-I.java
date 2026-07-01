1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int n = nums.length;
4        if (n < 4) return false;
5        int i = 0;
6
7        while (i + 1 < n && nums[i] < nums[i+1]) {
8            i++;
9        }
10
11        if (i == 0 || i == n - 1) return false;
12
13        int p = i;
14        while (i + 1 < n && nums[i] > nums[i+1]) {
15            i++;
16        }
17
18        if (i == p || i == n - 1) return false;
19
20        while (i + 1 < n && nums[i] < nums[i+1]) {
21            i++;
22        }
23
24        return i == n - 1;
25    }
26}