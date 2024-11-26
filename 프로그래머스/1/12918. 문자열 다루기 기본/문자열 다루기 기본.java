class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!('0' <= c && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}