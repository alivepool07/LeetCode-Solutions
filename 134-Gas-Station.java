class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currentIndex = 0;
        int maxSurplus = 0;
        int overallSurplus = 0;
        int n = gas.length;
        
        for(int i = 0; i < n ;i++){

            int profit = gas[i] - cost[i];

            overallSurplus += profit;
            maxSurplus += profit;

            if(maxSurplus < 0) {
                currentIndex = i+1;
                maxSurplus = 0;
            }
        }
        if(overallSurplus < 0) {
                return -1;
        }
        return currentIndex;   
    }
}