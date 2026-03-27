1class Solution {
2    public int[] exclusiveTime(int n, List<String> logs) {
3        int[] result = new int[n];
4        if (n == 0 || logs == null || logs.size() == 0) {
5            return result;
6        }
7        Deque<Integer> stack = new ArrayDeque<>();
8        int prevTime = 0;
9
10        for (String log : logs) {
11            String[] logParts = log.split(":");
12            int curTime = Integer.parseInt(logParts[2]);
13
14            if ("start".equals(logParts[1])) {
15                if (!stack.isEmpty()) {
16                    result[stack.peek()] += curTime - prevTime;
17                }
18                stack.push(Integer.parseInt(logParts[0]));
19                prevTime = curTime;
20            } else {
21                result[stack.pop()] += curTime - prevTime + 1;
22                prevTime = curTime + 1;
23            }
24        }
25
26        return result;
27    }
28}