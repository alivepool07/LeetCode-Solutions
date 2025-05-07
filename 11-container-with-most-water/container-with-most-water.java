class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n-1;
        int gmax = 0;
        while(i < j) {
            int max = (j-i) * Math.min(height[i] , height[j]);
            gmax = Math.max(gmax, max);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return gmax;
    }
}