class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxVolume = (right - left) * Math.min(heights[left], heights[right]);

        while(left < right) {
            if (heights[left] < heights[right]) {
                ++left;
            } else {
                --right;
            }
            maxVolume = Math.max((right - left) * Math.min(heights[left], heights[right]), maxVolume);
        }

        return maxVolume;
    }
}
