class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length-1;   // start with the maximum (j-i)
        int minHeight;
        while (i < j) {
            minHeight = Math.min(height[i], height[j]);
            int area = (j-i) * minHeight;
            if (area > result) result = area;
            if (height[i] >= height[j]) {   // j moves and find higher
                while (i < j && height[j] <= minHeight) {
                    j--;
                }
            } else {   // i moves and find higher
                while (i < j && height[i] <= minHeight) {
                    i++;
                }
            }
        }
        return result;
    }
}