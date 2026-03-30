1    class Solution
2    {
3        public int[] dailyTemperatures(int[] T)
4        {
5            DMQ q = new DMQ(T.length, 0);
6
7            for (int i = T.length - 1; i >= 0; i--)
8            {
9                q.push(new Item(T[i], i));
10            }
11
12            return q.getNearestValues();
13        }
14
15        public class DMQ
16        {
17            private Deque<Item> q = new ArrayDeque<>();
18            private int[] nearestValues;
19            private int defaultValue;
20
21            public DMQ(int size, int defaultValue)
22            {
23                this.nearestValues = new int[size];
24                this.defaultValue = defaultValue;
25            }
26
27            public void push(Item currentItem)
28            {
29                while (!q.isEmpty() && currentItem.value >= q.peekLast().value)
30                {
31                    q.removeLast();
32                }
33
34                setNearestValue(currentItem.index);
35
36                q.addLast(currentItem);
37            }
38
39            private void setNearestValue(int currentItemIndex)
40            {
41                nearestValues[currentItemIndex] = defaultValue;
42                if (!q.isEmpty())
43                {
44                    nearestValues[currentItemIndex] = q.peekLast().index - currentItemIndex;
45                }
46            }
47
48            public int[] getNearestValues()
49            {
50                return nearestValues;
51            }
52        }
53
54        private class Item
55        {
56            int value, index;
57
58            Item(int val, int ind)
59            {
60                this.value = val;
61                this.index = ind;
62            }
63        }
64    }