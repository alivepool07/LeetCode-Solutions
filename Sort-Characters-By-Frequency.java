1class Solution {
2    public String frequencySort(String s) {
3        StringBuilder ans = new StringBuilder();
4        int[] fre = new int[128];
5        int n =s.length();
6
7        for(int i = 0; i < n; i++) {
8            fre[s.charAt(i)]++;
9        }
10
11        while(ans.length() < n) {
12            int max = 0;
13
14            for(int i =1; i< 128; i++) {
15                if(fre[i] > fre[max]) {
16                    max = i;
17                }
18            }
19
20            for(int i =0; i < fre[max] ; i++) {
21                ans.append((char)max);
22            }
23            fre[max] =0;
24        }
25        return ans.toString();
26    }
27}