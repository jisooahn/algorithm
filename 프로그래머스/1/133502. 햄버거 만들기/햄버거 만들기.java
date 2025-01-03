class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() >= 4) {
                if (sb.substring(sb.length() - 4).equals("1231")) {
                    answer++;
                    String s = sb.substring(0, sb.length() - 4);
                    sb = new StringBuilder(s);
                }
            }
        }
        return answer;
    }
}