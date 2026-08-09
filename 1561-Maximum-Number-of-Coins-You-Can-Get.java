class Solution {
    public int maxCoins(int[] piles) {
        
        int n = piles.length;
        Arrays.sort(piles);

        int i = 0;
        int j = n-1;
        int count = 0;

        while(i < j) {
            count += piles[--j];
            i++;
            j--;
        }
        return count;
    }
}