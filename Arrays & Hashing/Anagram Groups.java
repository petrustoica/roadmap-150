class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> anagramLists = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            int hashCode = Arrays.hashCode(sorted);
            List<String> list = anagramLists.getOrDefault(hashCode, new ArrayList<>());
            list.add(strs[i]);
            anagramLists.put(hashCode, list);
        }
        return new ArrayList(anagramLists.values());
    }
}
