class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> printSet = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                while ((-nums[i] != nums[left] + nums[right]) && left < right) {
                    if (-nums[i] < nums[left] + nums[right]) {
                        --right;
                    } else {
                        ++left;
                    }
                }
                if (left >= right) continue;

                printSet.add(Arrays.asList(nums[i], nums[left], nums[right]));

                --right;
                ++left;
            }
        }

        return new ArrayList<>(printSet);
    }
}
