class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index = seen.getOrDefault(nums[i], -1);
            if (index != -1)
                return new int[]{index, i};
            seen.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
