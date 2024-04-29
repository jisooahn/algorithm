class Solution {
    public int solution(int number, int limit, int power) {
        int count = 0;
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += j * j == i ? 1 : 2;
                }
            }
            answer += count <= limit ? count : power;
            count = 0;
        }
        return answer;
    }
}