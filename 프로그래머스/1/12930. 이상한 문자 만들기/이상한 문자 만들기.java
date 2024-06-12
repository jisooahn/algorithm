class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isEven = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
                isEven = true;
            } else {
                if (isEven) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                isEven = !isEven;
            }
        }
        return sb.toString();
    }
}