1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        int i = 0;
5        int j = numbers.length - 1;
6
7        while (i < j) {
8            int sum = numbers[i] + numbers[j];
9            if(sum == target) return new int[] {i+1,j+1};
10            else if( sum > target ) {
11                j--;
12            }
13            else {
14                i++;
15            }
16        }
17        return null;
18    }
19}