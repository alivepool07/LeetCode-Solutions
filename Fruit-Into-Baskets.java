1class Solution {
2    public int totalFruit(int[] fruits) {
3        int res = 0, slow = 0;
4        int types = 0;
5
6        int[] freq = new int[fruits.length];
7
8        for (int fast = 0; fast < fruits.length; fast++) {
9            int type = fruits[fast];
10            
11            if (freq[type] == 0) {
12                types++;
13            }
14            freq[type]++;
15
16            while(types > 2) {
17                int sType = fruits[slow];
18                freq[sType]--;
19                
20                if (freq[sType] == 0) {
21                    types--;
22                }
23                slow++;
24            }
25            res = Math.max(res, fast - slow + 1);
26        }
27        return res;
28    }
29}