class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (String pic : picture) {
            StringBuilder sb = new StringBuilder();
            for (char c : pic.toCharArray()) {
                sb.append(Character.toString(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                answer[idx++] = sb.toString();
            }
        }
        return answer;
    }
}