class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        final String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        final String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
                continue;
            } 
            String alphabet = Character.isLowerCase(c) ? lowerAlphabet : upperAlphabet;
            int idx = alphabet.indexOf(c);
            sb.append(alphabet.charAt((idx + n) % 26));
        }
        return sb.toString();
    }
}