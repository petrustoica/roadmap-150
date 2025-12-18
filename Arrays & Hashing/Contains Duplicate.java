class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> numbersMap = new HashMap<>();
        for (int i : nums) {
            if (numbersMap.containsKey(i))
                return true;
            numbersMap.put(i, true);
        }
        return false;
    }
}
