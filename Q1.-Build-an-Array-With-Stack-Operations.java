1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        List<String> res = new ArrayList<>();
4        int j = 0;
5
6        for (int i = 1; i <= n && j < target.length; i++) {
7            res.add("Push");
8            if (i == target[j]) {
9                j++;
10            } else {
11                res.add("Pop");
12            }
13        }
14        return res;
15    }
16}