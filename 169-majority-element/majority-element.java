class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       
        int n = nums.length;
        int max = n/2;

        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            int cnt = map.getOrDefault(num , 0);

            map.put(num  , cnt+1);

            if(cnt+1 > max) {
            return num;
        }
        }
       
        return -1;
    }
} 