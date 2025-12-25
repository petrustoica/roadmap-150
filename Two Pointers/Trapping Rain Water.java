class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxHeight = 0;
        int sum = 0;
        while (left < right) {
            while (maxHeight >= height[left] && left < right) {
                ++left;
                if (height[left] != 0 && left < right) {
                    sum -= Math.min(maxHeight, height[left]);
                }
            }
            while (maxHeight >= height[right] && left < right) {
                --right;
                if (height[right] != 0 && left < right) {
                    sum -= Math.min(maxHeight, height[right]);
                }
            }
            if (left < right) {
                sum += (right - left - 1) * (Math.min(height[left], height[right]) - maxHeight);
                maxHeight = Math.min(height[left], height[right]);
            }
        }
        return sum;
    }
}
