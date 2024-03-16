class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (mode == 0) {
                if (c != '1' && i % 2 == 0) {
                    answer += c;
                } 
            } else if (mode == 1) {
                if (c != '1' && i % 2 != 0) {
                    answer += c;
                } 
            }
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}