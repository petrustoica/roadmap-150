class Solution {
    public String encode(List<String> strs) {
        String encodedString = "";
        for (String str : strs) {
            encodedString += str + "\u001f";
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        if (str.equals(""))
            return new ArrayList();
        List<String> strs = new ArrayList(Arrays.asList(str.split("\u001f")));
        if (strs.isEmpty()) {
            strs.add("");
        }
        return strs;
    }
}

