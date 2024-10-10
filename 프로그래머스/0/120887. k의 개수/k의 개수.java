class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int idx = i; idx <= j; idx++) {
            int tmp = idx;
            while (tmp != 0) {
                if (tmp % 10 == k) {
                    answer++;
                }
                tmp /= 10;
            }
        }
        return answer;
    }
}