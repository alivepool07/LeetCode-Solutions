class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int count = 0 , leftMax = 0, rightMax = 0;

        while (i < j) {

            leftMax = Math.max(leftMax , height[i]);
            rightMax = Math.max(rightMax , height[j]);

            if(leftMax > rightMax) {
                count += rightMax - height[j];
                j--;
            }
            else{
                count += leftMax -height[i];
                i++;
            }
        }
        return count;
    }
}