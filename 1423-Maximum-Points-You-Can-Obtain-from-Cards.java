class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currSum = 0;

        for(int i = 0; i < k; i++) currSum += cardPoints[i];
        int maxSum = currSum;
        int j = n-1;
        int i =k-1;

        while (i >= 0) {
            currSum = currSum - cardPoints[i] + cardPoints[j];
            maxSum = Math.max(currSum , maxSum);

            i--;
            j--;
        }
        

        return maxSum;
    }
}