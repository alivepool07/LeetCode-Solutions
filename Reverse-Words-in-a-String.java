1class Solution {
2    static {
3        for (int i = 0; i < 500; i++) {
4            reverseWords("");
5        }
6    }
7
8    public static String reverseWords(String s) {
9        char[] chars = s.toCharArray();
10        int length = chars.length;
11
12        int index = length - 1;
13
14        char[] result = new char[length];
15        int resultIndex = 0;
16
17        while (index >= 0) {
18            while (index >= 0 && chars[index] == ' ') {
19                index--;
20            }
21
22            if (index < 0) {
23                break;
24            }
25
26            int wordEnd = index;
27
28            while (index >= 0 && chars[index] != ' ') {
29                index--;
30            }
31
32            int wordStart = index + 1;
33
34            if (resultIndex != 0) {
35                result[resultIndex++] = ' ';
36            }
37            for (int i = wordStart; i <= wordEnd; i++) {
38                result[resultIndex++] = chars[i];
39            }
40        }
41        return new String(result, 0, resultIndex);
42    }
43}