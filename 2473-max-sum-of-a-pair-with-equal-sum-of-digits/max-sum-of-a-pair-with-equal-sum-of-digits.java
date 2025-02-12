class Solution {
    public int maximumSum(int[] nums) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num :nums) {
            int dSum = sumOfDigits(num);
            if(map.containsKey(dSum)) {
                ans = Math.max(ans , map.get(dSum) +num);
                map.put(dSum , Math.max(map.get(dSum) , num));
            }
            else {
                map.put(dSum , num);
            }
        }
        return ans;
    }
    public int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num %10;
            num /= 10;
        }
        return sum;
    }
}