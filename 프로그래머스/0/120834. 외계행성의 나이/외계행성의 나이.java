class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghij";
        String str = Integer.toString(age);
        for (char c : str.toCharArray()) {
            sb.append(alphabet.charAt(c - '0'));
        }
        return sb.toString();
    }
}