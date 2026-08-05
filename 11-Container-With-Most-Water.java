class Solution {
    public int maxArea(int[] height) {
      int maxWater = 0;
      int i = 0;
      int j = height.length -1;

      while(i < j) {
        int max = (j-i) * Math.min(height[i], height[j]);
        maxWater = Math.max(maxWater , max);

        if(height[i] < height[j]) i++;
        else {
            j--;
        }
      }
    return maxWater;
    }
}