class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                c = Character.toUpperCase(c);
            } else if (c != 'A') {
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}