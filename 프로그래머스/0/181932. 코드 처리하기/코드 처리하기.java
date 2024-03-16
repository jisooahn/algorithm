class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (!mode) {
                if (c != '1' && i % 2 == 0) {
                    answer += c;
                } 
            } else {
                if (c != '1' && i % 2 != 0) {
                    answer += c;
                } 
            }
            if (c == '1') {
                mode = !mode;
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}