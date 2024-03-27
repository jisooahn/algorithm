class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else if (Character.isLowerCase(c)) {
                int idx = lowerAlphabet.indexOf(c);
                sb.append(lowerAlphabet.charAt((idx + n) % 26));
            } else {
                int idx = upperAlphabet.indexOf(c);
                sb.append(upperAlphabet.charAt((idx + n) % 26));
            }
        }
        return sb.toString();
    }
}