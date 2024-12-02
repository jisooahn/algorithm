class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String tmp = t.substring(i, i + p.length());
            long num = Long.parseLong(tmp);
            if (num <= target) {
                answer++;
            }
        }
        return answer;
    }
}