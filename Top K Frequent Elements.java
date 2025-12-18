class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int maxIndex = 0;
        int[] freq = new int[20000];
        for (int number : nums) {
            freq[number + 10000] += 1;
            List<Integer> specificFreqList = map.getOrDefault(freq[number + 10000], new ArrayList<Integer>());
            if (specificFreqList.isEmpty())
                map.put(freq[number + 10000], specificFreqList);
            specificFreqList.add(number + 10000);
            maxIndex = Math.max(maxIndex, freq[number + 10000]);
        }

        int[] res = new int[k];
        int index = 0;
        HashMap<Integer, Boolean> returned = new HashMap<>();
        for (int i = maxIndex; i >= 0 && index < k; i--) {
            for (int j : map.get(i)) {
                if (returned.containsKey(j))
                    continue;
                returned.put(j, true);
                res[index++] = j - 10000;
            }
        }
        return res;
    }
}
