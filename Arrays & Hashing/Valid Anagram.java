class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] s_chars = new char[255];
        char[] t_chars = new char[255];
        for (char character : s.toCharArray())
            s_chars[character] += 1;
        for (char character : t.toCharArray())
            t_chars[character] += 1;
        for (int i = 0; i < 255; i++) {
            if (s_chars[i] != t_chars[i])
                return false;
        }
        return true;
    }
}
