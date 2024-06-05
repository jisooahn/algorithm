class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (; c <= my_string.length(); c += m) {
            sb.append(my_string.charAt(c - 1));
        }
        return sb.toString();
    }
}