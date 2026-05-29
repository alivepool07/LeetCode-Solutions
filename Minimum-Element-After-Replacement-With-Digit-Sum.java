1class Solution {
2    public int minElement(int[] nums) {
3        
4     for(int i = 0; i < nums.length; i++){
5         
6         nums[i] = sumOfDigits(nums[i]);
7         
8     }
9      Arrays.sort(nums);
10      return nums[0]; 
11    }
12    public int sumOfDigits(int a) {
13        
14        int sum = 0;
15        while(a != 0){
16            sum += a % 10;
17            a /= 10;
18        }
19        return sum;
20        
21    }
22}