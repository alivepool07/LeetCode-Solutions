1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        Map <Integer, Integer> map = new HashMap<>();
5        for(int i = 0 ; i < nums.length ; i++){
6
7            int compliment = target - nums[i];
8            if (map.containsKey(compliment)) {
9
10                return new int[] {map.get(compliment) , i};
11            }
12
13            map.put(nums[i] , i);
14        }
15     
16  return null;
17}
18}
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67