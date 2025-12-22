class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftPartialProducts = new int[nums.length - 1];
        int[] rightPartialProducts = new int[nums.length - 1];
        
        leftPartialProducts[0] = nums[0];
        rightPartialProducts[nums.length - 2] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            leftPartialProducts[i] = leftPartialProducts[i - 1] * nums[i];
        }
        
        for (int i = nums.length - 2; i > 0; i--) {
            rightPartialProducts[i - 1] = rightPartialProducts[i] * nums[i];
        }
        
        int[] result = new int[nums.length];
        
        result[0] = rightPartialProducts[0];
        result[nums.length - 1] = leftPartialProducts[nums.length - 2];
        
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = leftPartialProducts[i - 1] * rightPartialProducts[i];
        }
        
        return result;
    }
}  

