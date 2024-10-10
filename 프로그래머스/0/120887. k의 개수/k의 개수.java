class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int idx = i; idx <= j; idx++) {
            char[] chars = Integer.toString(idx).toCharArray();
            for (char c : chars) {
                if ((c - '0') == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}