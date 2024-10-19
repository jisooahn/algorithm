class Solution {
    public String solution(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 1) {
                sb.append((char) ('a' + i));
            }
        }
        return sb.toString();
    }
}