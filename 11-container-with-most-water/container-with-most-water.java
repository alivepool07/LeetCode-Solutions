class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n-1;
        int gMax = 0;
        while (i < j) {
            int max = (j-i) * Math.min(height[i] , height[j]);
            gMax = Math.max(max , gMax);

            if(height[i] < height[j]) i++;
            else j--;
        }
        return gMax;
    }
}